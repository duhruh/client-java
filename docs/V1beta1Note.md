# V1beta1Note

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Output only. The name of the note in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. |  [optional]
**shortDescription** | **String** | A one sentence description of this note. |  [optional]
**longDescription** | **String** | A detailed description of this note. |  [optional]
**kind** | [**V1beta1NoteKind**](V1beta1NoteKind.md) |  |  [optional]
**relatedUrl** | [**List&lt;V1beta1RelatedUrl&gt;**](V1beta1RelatedUrl.md) | URLs associated with this note. |  [optional]
**expirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of expiration for this note. Empty if note does not expire. |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this note was created. This field can be used as a filter in list requests. |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this note was last updated. This field can be used as a filter in list requests. |  [optional]
**relatedNoteNames** | **List&lt;String&gt;** | Other notes related to this note. |  [optional]
**vulnerability** | [**VulnerabilityVulnerability**](VulnerabilityVulnerability.md) |  |  [optional]
**build** | [**BuildBuild**](BuildBuild.md) |  |  [optional]
**baseImage** | [**ImageBasis**](ImageBasis.md) |  |  [optional]
**_package** | [**PackagePackage**](PackagePackage.md) |  |  [optional]
**deployable** | [**DeploymentDeployable**](DeploymentDeployable.md) |  |  [optional]
**discovery** | [**DiscoveryDiscovery**](DiscoveryDiscovery.md) |  |  [optional]
**attestationAuthority** | [**AttestationAuthority**](AttestationAuthority.md) |  |  [optional]
