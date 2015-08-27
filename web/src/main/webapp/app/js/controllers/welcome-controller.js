angular.module('ParkSystem')
    .controller('WelcomeController', ['$scope','WelcomeService','$rootScope', function($scope, WelcomeService, $rootScope) {
        $scope.registrationInfo = {};
        $rootScope.show ={};

        init();
        function init(){
            $rootScope.hide = false;
        }
        $scope.saveRegistrationInfo = function(reg) {
            console.log(reg);
            WelcomeService.create(reg);
        };
    }]);

