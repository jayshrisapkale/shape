

public  class shape {
			float base=4;
			float height=6;
      public static void main(String[] args) {
				
				// TODO Auto-generated method stub
				Circle c=new Circle ();
				c.Area();
				Tringle t = new Tringle();
				t.Area();
				//shape s= new shape();
				
		
			}
			}


			class Tringle extends shape{
				float base =2;
				float height=8;
				double res;
				public void  Area(){
				res= (base*height)/2;
				System.out.println(res);
				}
				
			}
			class Circle extends shape{
				double  r=6;
				double  res=3.14;
				public  void Area() {
					  res =3.14*r*r;
					  System.out.println(res);
					  
				}
			

			}


			
			

		


	
 