public class DemoRange {
    private String input;

    public DemoRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return this.input.startsWith("[");
    }
}
