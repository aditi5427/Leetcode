public class rect {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        double diagonal = 0;

        for (int[] dimension : dimensions) {
            int l = dimension[0];
            int w = dimension[1];
            double maxDia = Math.sqrt(l * l + w * w);
            int maxArea = l * w;

            if (maxDia > diagonal) {
                diagonal = maxDia;
                area = maxArea;

            } else if (maxDia == diagonal && maxArea > area) {
                area = maxArea;
            }
        }
        return area;
    }
}
