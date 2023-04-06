package hw_5;

/*
 * Рефакторинг одного из предыдущих дз с учетом паттерна MVC
 */
public class MainMVC {
    public static void main(String[] args) {
        Notebook model = new Notebook();
        model.setBrand("Lenovo");
        model.setModel("Legion 5");
        model.setCores(4);
        model.setOs("DOS");
        model.setRam(16);
        model.setHdd(512);
        model.setPrice(115290);

        NotebookView view = new NotebookView();
        NotebookController controller = new NotebookController(model, view);

        controller.updateView();

        controller.setNotebookBrand("Acer");
        controller.setNotebookModel("Aspire 3");
        controller.setNotebookCores(2);
        controller.setNotebookOs("Windows 10");
        controller.setNotebookRam(8);
        controller.setNotebookHdd(256);
        controller.setNotebookPrice(39990);

        controller.updateView();
        // Lenovo Legion 5, Cores: 4, OS: DOS, RAM: 16Gb, HDD: 512Gb, Price: 115.290₽
        // Acer Aspire 3, Cores: 2, OS: Windows 10, RAM: 8Gb, HDD: 256Gb, Price: 39.990₽
    }
}
