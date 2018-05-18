package cn.zywy.bean;

public class Provincial {
    private Integer  pId;   //省会编号
    private String  pName;  //省会名称

    public Provincial(Integer pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Provincial() {
    }

    @Override
    public String toString() {
        return "Provincial{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                '}';
    }
}
