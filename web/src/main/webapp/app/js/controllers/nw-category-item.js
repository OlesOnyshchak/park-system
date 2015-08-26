angular.module("NoteWrangler")
.directive("nwCategoryItem",function(){
    return {
        restrict: 'E',
        templateUrl: 'app/templates/pages/admin/nw-category-item.html',
        scope: {
            category: "="
        }
    }
});
