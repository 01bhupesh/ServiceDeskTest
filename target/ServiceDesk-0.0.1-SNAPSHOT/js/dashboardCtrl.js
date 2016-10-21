
sdWeb.controller('dashboardCtrl', function ($scope,$http){
	
	console.log("dashboard controole is called");
	
	    function getData() {
	    	console.log("dashboard get data is called");
           $http({
                   method : 'GET',
                   url : 'dashboard'
           }).success(function(data, status, headers, config) {
                   $scope.person = data;
                   console.log("data=="+data);
           }).error(function(data, status, headers, config) {
                   // called asynchronously if an error occurs
                   // or server returns response with an error status.
           });

   };
   getData();
});