public class ArrayCopier {
	public void copy (int[] src , int[] dst){
		if(src.length == dst.length){
			for(int x = 0; x< src.length; x++){
				dst[x] = src[x];
			}
		}
		else if(dst.length < src.length){
			for(int y = 0; y < dst.length; y++){
				dst[y] = src[y];
			}
		}
		else if(dst.length > src.length){
			for (int t = 0; t < dst.length; t++){
				if(t < src.length){
					dst[t] = src[t];
				}
				else{
					dst[t] = 0;
				}
			}
		}
		for (int i = 0; i < dst.length; i++) {
	   	System.out.print(dst[i] + ", ");
		}
	}

}