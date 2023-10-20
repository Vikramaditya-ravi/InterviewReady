/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

     int currIndex;
    List<Integer> flattenedList;
    List<NestedInteger> nestedList;


    public NestedIterator(List<NestedInteger> nestedList) {
        this.flattenedList = new ArrayList<>();
        this.nestedList = nestedList;
        this.currIndex = 0;
        utility(nestedList);


    }

    @Override
    public Integer next() {
        if (this.hasNext()){
            return flattenedList.get(currIndex++);
        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        return currIndex < flattenedList.size();

    }
    public void utility(List<NestedInteger> currList){
        for (NestedInteger nestedInteger : currList) {
            if (nestedInteger.isInteger()) {
                flattenedList.add(nestedInteger.getInteger());
            } else {
                utility(nestedInteger.getList());
            }

        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */