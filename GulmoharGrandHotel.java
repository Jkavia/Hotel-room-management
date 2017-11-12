package com;

import java.util.ArrayList;


public class GulmoharGrandHotel implements Hotel {
	private ArrayList<Room>roomList;
	private ArrayList<Customer>custList;
	public GulmoharGrandHotel(){
		this.roomList=new ArrayList<Room>();
		this.custList=new ArrayList<Customer>();
	}
	public static void main(String[] args) {
		Customer c1=new Customer("dev", 24, "Sdasfas");
		Customer c2=new Customer("arun", 20, "qwerty");
		Customer c3=new Customer("salman", 49, "bjrng");
		Customer c4=new Customer("dev", 26, "Sdasfas");
		Customer c5=new Customer("arun", 22, "qwerty");
		Room r1=new Room(201,"ac");
		Room r2=new Room(202,"ac");
		Hotel h=new GulmoharGrandHotel();
		System.out.println(h.addCustomer(c1));
		System.out.println(h.addCustomer(c2));
		System.out.println(h.addCustomer(c3));
		System.out.println(h.addCustomer(c4));
		System.out.println(h.addCustomer(c5));
		System.out.println(h.addRoom(r1));
		System.out.println(h.addRoom(r2));
		System.out.println(h.allocateRoom("ac"));
		
		
	}

	@Override
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
		int count=1;
		boolean flag = true;
		if(this.custList!=null && !this.custList.isEmpty())
		{
			for(Customer a : this.custList)
			{
				if(a != null && c != null && c.getCustomerName().equals(a.getCustomerName()) && c.getPassportNo().equals(a.getPassportNo()))
				{
					flag=false;
					System.out.println(a.getCustomerName());
					continue;
				}
				count=count+1;
			}
		}
		if(flag) {
			custList.add(c);
		}
		return count;
		
	}

	@Override
	public int addRoom(Room r) {
		// TODO Auto-generated method stub
		int count=1;
		boolean flag = true;
		if(this.roomList!=null && !this.roomList.isEmpty())
		{
			for(Room a : this.roomList)
			{
				if(a != null && r != null && r.getRoomNo()==a.getRoomNo())
				{
					flag=false;
					System.out.println(a.getRoomNo());
					continue;
				}
				count=count+1;
			}
		}
		if(flag) {
			roomList.add(r);
		}
		return count;
		
	}

	@Override
	public int allocateRoom(String s) {
		// TODO Auto-generated method stub
		int number=-1;
		if(this.roomList!=null && !this.roomList.isEmpty())
		{
			for(Room a : this.roomList)
			{
				if(a != null && a.getRoomType().equals(s))
				{
					if(!a.isRoomOccupied())
					{
						a.setRoomOccupied(true);
						System.out.println(a.isRoomOccupied());
						number=a.getRoomNo();
						break;
					}
					else{
						number=0;
						break;
					}
					
					 
				}
				
			}
		}
		
		return number;
		
	}

}
