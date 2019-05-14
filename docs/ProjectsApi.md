# ProjectsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectsApi.md#createProject) | **POST** /v1beta1/projects | Creates a new project.
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /v1beta1/{name&#x3D;projects/*} | Deletes the specified project.
[**getProject**](ProjectsApi.md#getProject) | **GET** /v1beta1/{name&#x3D;projects/*} | Gets the specified project.
[**listProjects**](ProjectsApi.md#listProjects) | **GET** /v1beta1/projects | Lists projects.

<a name="createProject"></a>
# **createProject**
> ProjectProject createProject(body)

Creates a new project.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
ProjectProject body = new ProjectProject(); // ProjectProject | The project to create.
try {
    ProjectProject result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectProject**](ProjectProject.md)| The project to create. |

### Return type

[**ProjectProject**](ProjectProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> Object deleteProject(name)

Deletes the specified project.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String name = "name_example"; // String | The name of the project in the form of `projects/{PROJECT_ID}`.
try {
    Object result = apiInstance.deleteProject(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the project in the form of &#x60;projects/{PROJECT_ID}&#x60;. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> ProjectProject getProject(name)

Gets the specified project.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String name = "name_example"; // String | The name of the project in the form of `projects/{PROJECT_ID}`.
try {
    ProjectProject result = apiInstance.getProject(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the project in the form of &#x60;projects/{PROJECT_ID}&#x60;. |

### Return type

[**ProjectProject**](ProjectProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProjects"></a>
# **listProjects**
> ProjectListProjectsResponse listProjects(filter, pageSize, pageToken)

Lists projects.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of projects to return in the list.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    ProjectListProjectsResponse result = apiInstance.listProjects(filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#listProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of projects to return in the list. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**ProjectListProjectsResponse**](ProjectListProjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

