 var app=angular.module('ford', ['ngMaterial']);
 
 app.controller('fordController',['$scope','$http',function($scope,$http){
	$scope.currentNavItem = 'Home';
	$scope.dashboard={};
	$scope.ford=[];
	$scope.datasheet = [];
	 /***
	  * 
	  *  Initial Call
	  *  
	  *  
	  *  */
	$http({method:'GET',url:'/users'})
	.then(function(response){
		$scope.ford=response.data;
	})
	
	$scope.getData = function()
	{
		$http({method:'GET',url:'/datasheet/ecn/'+$scope.dashboard.engineeringCommodityName+'/region/'+$scope.dashboard.region})
		.then(function(response){
			$scope.datasheet=response.data;
			console.log(JSON.stringify($scope.datasheet));
		})
	
	}
}]);