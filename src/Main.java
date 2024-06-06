import controller.UserController;
import model.dto.UserDto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.addNewUser(new UserDto("heng","heng@gmail.com"));
        userController.addNewUser(new UserDto("hong","hong@gmail.com"));
        userController.deleteById(1);
        userController.getAllUsers().forEach(System.out::println);
    }
}