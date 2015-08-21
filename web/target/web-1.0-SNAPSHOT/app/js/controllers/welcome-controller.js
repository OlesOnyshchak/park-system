angular.module('ParkSystem')
    .controller('WelcomeController', ['$scope','WelcomeService', function($scope, WelcomeService) {
        $scope.registrationInfo = {};
        $scope.saveRegistrationInfo = function(reg) {
            console.log(reg);
            WelcomeService.create(reg);
        };
    }]);

