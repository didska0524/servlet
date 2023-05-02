package hello.servlet.basic;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter // lombok 에서 제공하는 @Getter , @Setter 덕분에 코드가 자동으로 추가된다.(눈에 보이지는 않는다.)
public class HelloData {
    private String username;
    private int age;
}