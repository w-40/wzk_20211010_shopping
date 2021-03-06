package nuc.sw.shopping.entity;

/**
 * @author wzk
 * @version 1.0
 * @description 电商购物平台实体类：书籍类目
 */
public class Category {
    private int id;
    private String firstLevel;        //一级类目
    private String secondLevel;        //二级类目

    public Category(int id, String firstLevel, String secondLevel) {
        this.id = id;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(String firstLevel) {
        this.firstLevel = firstLevel;
    }

    public String getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(String secondLevel) {
        this.secondLevel = secondLevel;
    }

    @Override
    public String toString() {
        // 小说 > 玄幻小说
        return firstLevel + ">" + secondLevel;
    }
}