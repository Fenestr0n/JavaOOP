package hw_6;
/*
 * Реализация паттерна Builder
 */
public class MainBuilder {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook = NotebookBuilder.getInstance().setBrand("Lenovo").setModel("IdeaPad Gaming 3").setCores(4).setOs("Windows 11").setRam(16).setHdd(512).setPrice(112190).build();
        var notebook2 = NotebookBuilder.getInstance().setBrand("Lenovo").setModel("Legion 5").setCores(4).setOs("DOS").setRam(16).setHdd(512).setPrice(115290).build();
        var notebook3 = NotebookBuilder.getInstance().setBrand("Acer").setModel("Aspire 3").setCores(2).setOs("Windows 10").setRam(8).setHdd(256).setPrice(39990).build();
         
        System.out.println(notebook);
        System.out.println(notebook2);
        System.out.println(notebook3);
    }
}
