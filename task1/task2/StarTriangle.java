package practice2.task1.task2;

class StarTriangle {
    private int w;

    public StarTriangle(int w) {
        this.w = w;

    }

    public String toString() {
        String res = "";

        for (int i = 0; i <= this.w; i++) {
            for (int j = 0; j < i; j++) {
                res += "[*]";
            }
            res += "\n";
        }
        return  res;
    }
}
