package routis.examples.jacksondemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.core.io.ClassPathResource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@JsonTest
class JacksonDemoApplicationTests {

    private static final Student MARK_TWAIN = new Student("Mark", "Twain",null);

    @Autowired
    private JacksonTester<Student> json;

    @Test
    @DisplayName("A null Map<String,String> is mapped as null in json")
    public void testSerialize() throws Exception {
        JsonContent<Student> content = this.json.write(MARK_TWAIN);
        assertThat(content).isEqualToJson(new ClassPathResource("mark.twain.expected.json"));
    }

    @Test
    @DisplayName("An empty json array, when using accept-empty-array-as-null-object=true, is mapped to a Map<String,String> as null")
    public void testDeserialize() throws Exception {
        String content = "{\n" +
                "  \"firstName\": \"Mark\",\n" +
                "  \"lastName\": \"Twain\",\n" +
                "  \"classGrades\": []\n" +
                "}";
        ObjectContent<Student> parsed = this.json.parse(content);
        assertThat(parsed).isEqualTo(MARK_TWAIN);
        assertThat(parsed.getObject().getClassGrades()).isNull();
    }


}
