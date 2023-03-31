import java.sql.Date;
import java.sql.Time;

public class Exam {
    int id; //định danh của đề thi
    int code; // mã đề thi
    int title; // tiêu đề của đề thi
    CategoryQuestion categoryQuestion;
    int categoryID;  //định danh của chủ đề thi
    Time duration; //thời gian thi
    int creatorID; //id của người tạo đề thi
    Date createDate; //ngày tạo đề thi
    Question[] questions;
}
