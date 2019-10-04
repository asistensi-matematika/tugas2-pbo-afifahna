/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasis2;

/**
 *
 * @author AFIFAH NADHIRAH
 */
public class customer {
    private String name;
    private boolean member;
    private String membertype;
    
    public customer() {
    this.member=false;
    }
    public customer (String name,String membertype){
        this.name=name;
        this.membertype=membertype;
    }
    public String getName(){
    return name;
    }
    public boolean IsMember(){
        return member;
    }
    public void setMember(){
        this.member=member;
    }
    public String getMembertype(){
        return membertype;
    }
    public void SetMembertype(String membertype){
        this.membertype=membertype;
    }
    
    @Override
    public String toString(){
         return "Nama= " + name + " Jenis Member= " + membertype;
    }
}
