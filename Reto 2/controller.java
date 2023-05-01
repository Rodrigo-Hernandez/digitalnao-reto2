public class ScholarAuthorController {
  private ScholarAuthorModel model;
  private ScholarAuthorView view;

  public ScholarAuthorController(ScholarAuthorModel model, ScholarAuthorView view) {
      this.model = model;
      this.view = view;
  }

  public String getData(String authorId) throws Exception {
      return model.getData(authorId);
  }

  public void displayData() throws Exception {
      view.displayData();
  }
}
