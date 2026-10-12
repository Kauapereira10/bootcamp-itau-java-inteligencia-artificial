import dao.GenericDAO;
import dao.UserDAO;
import domain.UserDomain;

public class TesteGenerics {

    private static GenericDAO<Integer ,UserDomain > dao = new UserDAO();

    public static void main(String[] args) {
        UserDomain userDomain = new UserDomain(1,"Kaua", 20);
        System.out.println(dao.count());
        System.out.println(dao.save(userDomain));
        System.out.println(dao.count());
        System.out.println(dao.findAll( ));
        System.out.println(dao.find(userDomain1 -> userDomain.getName() == "Kaua"));
    }

}
