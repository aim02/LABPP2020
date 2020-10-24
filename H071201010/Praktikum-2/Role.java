public class Role {

    public static void main(String[] args) {
      int menuIndex = 0;
      int subMenuIndex = 0;
      boolean isValidRole = false;
  
      if (args.length == 0) {
        System.out.println("What role you want to see ?");
        System.out.println("For example, try 'Admin'.");
      }else if (args.length == 1) {
            if (args[0].equals("Super Admin")) {
                System.out.printf("%d. Super Admin\n", menuIndex=1);
                System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex=1, subMenuIndex=1);
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex=1, subMenuIndex=2);
                System.out.printf("%2d.%d. CRUD User\n\n", menuIndex=1, subMenuIndex=3);     
                System.out.printf("%d. Admin\n", menuIndex=2);
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex=2, subMenuIndex=1);
                System.out.printf("%2d.%d. CRUD User\n\n", menuIndex=2, subMenuIndex=2);
            }else if(args[0].equals("Admin")){
                System.out.printf("%d. Admin\n", menuIndex=1);
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex=1, subMenuIndex=1);
                System.out.printf("%2d.%d. CRUD User\n\n", menuIndex=1, subMenuIndex=2);
            }else if(args[0].equals("User")){
                System.out.printf("%d. User\n", menuIndex=1);
                System.out.printf("%2d.%d. View\n", menuIndex=1, subMenuIndex=1);
                System.out.printf("%2d.%d. Edit\n", menuIndex=1, subMenuIndex=2);
            }else{
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
            }else{
                System.out.println("Too many argument");
              }
        }
    }


          