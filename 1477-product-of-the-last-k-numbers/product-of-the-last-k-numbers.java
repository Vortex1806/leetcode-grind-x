class ProductOfNumbers {
    List<Integer> valueList;
    List<Integer> productList;
    int lastProduct;

    public ProductOfNumbers() {
        valueList = new ArrayList<>();
        productList = new ArrayList<>();
        lastProduct=1;
    }
    
    public void add(int num) {
        valueList.add(num);
        lastProduct = lastProduct * num;
        productList.add(lastProduct);
    }
    
    public int getProduct(int k) {
        int n = valueList.size();
        int prod = 1;
        for(int i = n-1; i >= n-k; i--) {
            prod = prod * valueList.get(i);
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */