# PackageDistribution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpeUri** | **String** | Required. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. |  [optional]
**architecture** | [**PackageArchitecture**](PackageArchitecture.md) |  |  [optional]
**latestVersion** | [**PackageVersion**](PackageVersion.md) |  |  [optional]
**maintainer** | **String** | A freeform string denoting the maintainer of this package. |  [optional]
**url** | **String** | The distribution channel-specific homepage for this package. |  [optional]
**description** | **String** | The distribution channel-specific description of this package. |  [optional]
