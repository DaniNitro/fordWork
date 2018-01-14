 var app=angular.module('ford', ['ngMaterial']);
 
 app.controller('fordController',['$scope','$http',function($scope,$http){
	$scope.currentNavItem = 'Home';
	$scope.ford=[];
	$http({
			method:'GET',
			url:'/users'
		
	}).then(function(response){
		console.log(JSON.stringify(response.data));
		$scope.ford=response.data;
	})
}]);