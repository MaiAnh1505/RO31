import java.sql.Date;

public class Account {
    int id; //định danh của User
    String email;
    String userName;
    Department department; //phòng ban
    Position position; //chức vụ
    Date createDate; //ngày tạo tài khoản
    Group[] groups;
}
