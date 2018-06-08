package cn.test.entity;

public class Order {
    private Integer id;

    private String ordername;

    private Integer userid;
    
 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }



	@Override
	public String toString() {
		return "Order [id=" + id + ", ordername=" + ordername + ", userid="
				+ userid +  "]";
	}

	
    
}