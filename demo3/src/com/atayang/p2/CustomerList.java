package com.atayang.p2;

/**
 *
 */
public class CustomerList {

//    用来保护客户对象的数组
    private Customer[] customers;
//    记录已保存客户对象的数量
    private int total;

    /**
     * CustomerList的构造器
     * @param totalCustomer ： 指明创建的Customer数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的customer添加到customers数组中
     * @param customer
     * @return 是否添加成功。true：添加成功； false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total>=customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * 替换指定索引位置上的客户
     * @param index 要替换的位置
     * @param cust 要替换的对象
     * @return 替换是否成功
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index<0||index>=total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置上的元素
     * @param index 要删除元素的索引位置
     * @return 删除是否成功
     */
    public boolean deleteCustomer(int index){
        if(index<0||index>=total){
            return false;
        }
        if (total - 1 - index >= 0) System.arraycopy(customers, index + 1, customers, index, total - 1 - index);
        customers[--total] = null;
        return true;
    }

    /**
     * 返回所有构成的数组
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        if (custs.length >= 0) System.arraycopy(customers, 0, custs, 0, custs.length);
        return custs;
    }

    /**
     * 返回指定索引位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index<0||index>=total){
            return null;
        }
        return customers[index];
    }

    /**
     * 返回存储的客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }



}
