angular.module('ParkSystem')
    .controller('WelcomeController', function($scope, $http) {
        $scope.registrationInfo = {};
        $scope.saveRegistrationInfo = function(reg) {
            console.log(reg);
            $http.post('registration',reg).success(function(data){
                console.log("ok");
            });
        };
    });

