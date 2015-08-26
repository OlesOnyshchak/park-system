angular.module("NoteWrangler")
    .directive("nwCategorySelect",function(){
        return {
            replace: true,
            restrict: 'E',
            templateUrl: 'app/templates/pages/admin/nw-category-item.html'
        }
    });
