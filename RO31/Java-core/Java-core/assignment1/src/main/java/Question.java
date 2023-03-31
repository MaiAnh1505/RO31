import java.sql.Date;
public class Question {
    int id; //định danh của câu hỏi (
    String cuestion; //nội dung của câu hỏi
    TypeQuestion type;
    int category; //định danh của chủ đề câu hỏi
    Account creator; //id của người tạo câu hỏi
    Date createDate; //id của người tạo câu hỏi

}