angular.module('ParkSystem')
    .controller('AdminController', ['$scope','AdminService','$rootScope', function($scope, AdminService, $rootScope) {
        var tabClasses;

        $scope.createJob = {};

        $scope.addPlant = {};

        init();

        function init(){
            $rootScope.hide = true;
        }

        $rootScope.admin = [true, true, true, true,true];

        $rootScope.setActiveTab = function(order){

            for(i=0;i<$rootScope.admin.length;i++){
                if($rootScope.admin[i]!=$scope.admin[order]){
                    console.log(i);
                    $rootScope.admin[i] = true;
                }
            }
            $rootScope.admin[order] = false;
        };

        $scope.saveJob = function(reg) {
            console.log(reg);
      /*      AdminService.create(reg);*/
        };

    }]);
