import java.sql.Date;
public class Program {
    public static void main(String[] args) {
        // Tạo Department
        Department dep1 = new Department();
        dep1.departmentID = 1;
        dep1.departmentName = "Marketing";

        Department dep2 = new Department();
        dep2.departmentID = 2;
        dep2.departmentName = "Sale";

        System.out.println("Thông tin các phòng ban");
        System.out.println(dep1);
        System.out.println(dep2);


        // Tạo position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.DEV;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.TEST;

        System.out.println(" Thông tin các vị trí công việc ");
        System.out.println(pos1);
        System.out.println(pos2);



        // Tạo Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "maianh1";
        acc1.userName = "maianh1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = new Date(2020 - 11 - 12);


        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "maianh2";
        acc2.userName = "maianh2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = new Date(2010 - 12 - 15);


        System.out.println(" Thông tin các tài khoản ");
        System.out.println(acc1);
        System.out.println(acc2);



        // Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Developer";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Test";

        System.out.println(" Thông tin các nhóm ");
        System.out.println(group1);
        System.out.println(group2);



        // Tạo GroupAccount
        GroupAccount ga1 = new GroupAccount();
        ga1.groupID = 1;
        ga1.joinDate = new Date(2011 - 10 - 12);

        GroupAccount ga2 = new GroupAccount();
        ga2.groupID = 2;
        ga2.joinDate = new Date(2011 - 10 - 12);


        System.out.println(" Thông tin các User ");
        System.out.println(ga1);
        System.out.println(ga2);


        // Tạo TypeQuestion
        TypeQuestion tq1 = new TypeQuestion();
        tq1.id = 1;
        tq1.typeName = "Essay";

        TypeQuestion tq2 = new TypeQuestion();
        tq2.id = 2;
        tq2.typeName = "Multiple-Choice";

        System.out.println(" Thông tin các câu hỏi ");
        System.out.println(tq1);
        System.out.println(tq2);



        // Tạo CategoryQuestion
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.categoryID = 1;
        cq1.categoryName = "Java";

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.categoryID = 2;
        cq2.categoryName = "Java";

        System.out.println("Thông tin câu hoi");
        System.out.println(cq1);
        System.out.println(cq2);


    }
}
