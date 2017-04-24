angular
	.module('job')
	.controller('JobCtrl', function($scope, $http) {
		
		$scope.changeJob = function(job) {
			var jobID = job;
			var targetURL = "http://localhost:8080/job?job=";
			//var targetURL = "http://floorsfrontmidinteg-env.us-west-1.elasticbeanstalk.com/job?name=";
			targetURL = targetURL.concat(jobID);
			
			$http.get(targetURL).
				then(function(response) {
					$scope.currentJob = response.data;
					console.log(response.data);
				});
		}
});