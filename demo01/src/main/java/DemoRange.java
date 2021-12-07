public class DemoRange {
    private String input;

    public DemoRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean endWithInclude() {
        return this.input.endsWith("]");
    }

    public int getStartNumber() {
        if(startWithInclude()) {
            return Integer.parseInt(this.input.charAt(1) + "");
        }
        return Integer.parseInt(this.input.charAt(1) + "") + 1;
    }
}
