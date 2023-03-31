import java.sql.Date;

public class Group {
    int  id; //định danh của nhóm
    String name; //tên nhóm
    Account creator; // id của người tạo group
    Date createDate; //ngày tạo group
    Account[] accounts;
}
