var helloAjaxApp = angular.module("myApp", []);
sdWeb.controller("myCtrl", [ '$scope', '$http', function($scope, $http) {
$scope.sendPost = function(detail) {
	
    $http({
    	   method : 'POST',
         url : 'rest/dashboard/users',   
         data  :{
        	 'data' : detail
         }
          }).then(function(response) {        	
           console.log(response.data);
           $scope.userList = response.data;
           console.log(userList.size());
    }, function(response) {
        //fail case
        console.log(response);
        $scope.message = response;
    });
};

     $scope.pushData = function(item){
    	 console.log("update method is called");
		     $scope.user=item;
		        };
		        
        $scope.remove = function(name){				
		    		var index = -1;		
		    		var comArr = eval( $scope.userList );
		    		for( var i = 0; i < comArr.length; i++ ) {
		    			if( comArr[i].name === name ) {
		    				index = i;
		    				break;
		    			}
		    		}
		    		$scope.userList.splice( index, 1 );		
		    	};

} ]);

