public interface Registry {
    void add(String key,VMinstance obj);
    VMinstance getValue(String key);

}
