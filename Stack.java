public interface Stack<E>{
    /**
     *
     * @param item
     *
     */
    public void push(E item);

    /**
     *
     * @return
     *
     */

    public E pop();

    /**
     *
     * @return
     *
     */
    public E peek();

    /**
     *
     * @return
     *
     */
    public boolean empty();

    /**
     *
     * @return
     *
     */
    public int size();
}
