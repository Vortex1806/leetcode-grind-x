class ProductOfNumbers {
    List<Integer> productList;
    int lastProduct;

    public ProductOfNumbers() {
        productList = new ArrayList<>();
        lastProduct=1;
    }
    
    public void add(int num) {
        if (num == 0) {
            productList.clear();
            lastProduct = 1;
        } else {
            lastProduct = lastProduct * num;
            productList.add(lastProduct);
        }
    }
    
    public int getProduct(int k) {
        if (k > productList.size()) {
            return 0;
        }
        int currentValue = productList.get(productList.size() - 1);
        if(k == productList.size()) return currentValue;
        return currentValue / productList.get(productList.size()-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */