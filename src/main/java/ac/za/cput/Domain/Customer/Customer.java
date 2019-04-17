package ac.za.cput.Domain.Customer;

public class Customer {

    int custId, custPhone;
    String custName, custSurname, custEmail, custAddress;
    boolean mem;

    public Customer(Builder builder) {
        this.custId = builder.custId;
        this.custPhone = builder.custPhone;
        this.custName = builder.custName;
        this.custSurname = builder.custSurname;
        this.custEmail = builder.custEmail;
        this.custAddress = builder.custAddress;
        this.mem = builder.mem;
    }

    public int getCustId() {
        return custId;
    }

    public int getCustPhone() {
        return custPhone;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public boolean isMem() {
        return mem;
    }

    public static class Builder
    {
        int custId, custPhone;
        String custName, custSurname, custEmail, custAddress;
        boolean mem;

        public Builder custId(int custId)
        {
            this.custId = custId;
            return this;
        }

        public Builder custPhone(int custPhone)
        {
            this.custPhone = custPhone;
            return this;
        }

        public Builder custName(String custName)
        {
            this.custName = custName;
            return this;
        }

        public Builder custSurname(String custSurname)
        {
            this.custSurname = custSurname;
            return this;
        }

        public Builder custEmail(String custEmail)
        {
            this.custEmail = custEmail;
            return this;
        }

        public Builder custAddress(String custAddress)
        {
            this.custAddress = custAddress;
            return this;
        }

        public Builder mem(boolean mem)
        {
            this.mem = mem;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custPhone=" + custPhone +
                ", custName='" + custName + '\'' +
                ", custSurname='" + custSurname + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", mem=" + mem +
                '}';
    }
}
