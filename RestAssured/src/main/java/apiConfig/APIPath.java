package apiConfig;

public class APIPath {
	
	public static final class apiPath{
		
		/* This is if we are using Req.in
		 * //GET API's public static final String GET_LIST_OF_USERS =
		 * "/api/users?page=2"; public static final String GET_SINGLE_USER =
		 * "/api/users/2";
		 * 
		 * //POST API's public static final String CREATE_USER = "/api/users";
		 * 
		 * 
		 * //DELETE API's public static final String DELETE_USER = "/api/users/2";
		 */
		
		//For using the JSON Server urls
		
		//GET
		public static final String GET_LIST_OF_POSTS = "posts";
		public static final String GET_SINGLE_POST = "posts/";
		
		//POST
		public static final String CREATE_POST = "posts";
		
		//Update POST
		public static final String UPDATE_POST = "posts";
		
		
	}
	
	/*
	 * // Added for testing "API Path" Class file - testing purpose only public
	 * static void main(String[] args) {
	 * System.out.println(APIPath.apiPath.CREATE_USER);
	 * System.out.println(APIPath.apiPath.DELETE_USER);
	 * System.out.println(APIPath.apiPath.GET_LIST_OF_USERS);
	 * System.out.println(APIPath.apiPath.GET_SINGLE_USER); }
	 */
	 

}
