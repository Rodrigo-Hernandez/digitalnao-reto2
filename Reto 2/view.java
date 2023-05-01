import java.util.Scanner;

public class ScholarAuthorView {
    private ScholarAuthorController controller;

    public void setController(ScholarAuthorController controller) {
        this.controller = controller;
    }

    public void displayData() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author ID: ");
        String authorId = scanner.nextLine();
        String data = controller.getData(authorId);
        System.out.println(data);
    }
}
