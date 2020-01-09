class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows == 0)return triangle;
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for(int  i = 1;i < numRows; i++){
            List<Integer> rows = new ArrayList<Integer>();
            List<Integer> prevrow = triangle.get(i-1);
            rows.add(1);
            for(int j = 1;j < i; j++){
                rows.add(prevrow.get(j-1) + prevrow.get(j));
            }
            rows.add(1);
            triangle.add(rows);
        }
        return triangle;
    }
}