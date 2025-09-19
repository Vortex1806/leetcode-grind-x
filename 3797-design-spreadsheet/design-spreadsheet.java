class Spreadsheet {
    private Map<Character, int[]> spreadSheet;
    public Spreadsheet(int rows) {
        spreadSheet = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            int[] arr = new int[rows];
            Arrays.fill(arr, 0);
            spreadSheet.put((char) ('A' + i), arr);
        }
    }
    
    public void setCell(String cell, int value) {
        Character col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1)) - 1;
        spreadSheet.get(col)[row] = value;
    }
    
    public void resetCell(String cell) {
        Character col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1)) - 1;
        spreadSheet.get(col)[row] = 0;
    }

    public int getLocationValue(String location) {
        try {
            return Integer.parseInt(location);
        } catch(Exception e) {
            Character col = location.charAt(0);
            int row = Integer.parseInt(location.substring(1)) - 1;
            return spreadSheet.get(col)[row];
        }
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] valueToAdd = formula.split("\\+");
        return getLocationValue(valueToAdd[0]) + getLocationValue(valueToAdd[1]);
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */