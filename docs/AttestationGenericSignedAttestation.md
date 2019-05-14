# AttestationGenericSignedAttestation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | [**AttestationGenericSignedAttestationContentType**](AttestationGenericSignedAttestationContentType.md) |  |  [optional]
**serializedPayload** | **String** | The serialized payload that is verified by one or more &#x60;signatures&#x60;. The encoding and semantic meaning of this payload must match what is set in &#x60;content_type&#x60;. |  [optional]
**signatures** | [**List&lt;V1beta1Signature&gt;**](V1beta1Signature.md) | One or more signatures over &#x60;serialized_payload&#x60;.  Verifier implementations should consider this attestation message verified if at least one &#x60;signature&#x60; verifies &#x60;serialized_payload&#x60;.  See &#x60;Signature&#x60; in common.proto for more details on signature structure and verification. |  [optional]
