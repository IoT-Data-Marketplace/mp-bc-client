package com.iotdatamp.mpbcclient.contract;

import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.*;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple6;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class Sensor extends Contract {
    public static final String BINARY = "60806040523480156200001157600080fd5b506040516200144b3803806200144b8339810180604052620000379190810190620001fe565b60008054600160a060020a031916600160a060020a0387161780825585919060a060020a60ff021916740100000000000000000000000000000000000000008360028111156200008357fe5b021790555082516200009d906001906020860190620000cc565b508151620000b3906002906020850190620000cc565b5060045550506003805460ff19169055506200034c9050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200010f57805160ff19168380011785556200013f565b828001600101855582156200013f579182015b828111156200013f57825182559160200191906001019062000122565b506200014d92915062000151565b5090565b6200016e91905b808211156200014d576000815560010162000158565b90565b60006200017f8251620002fd565b9392505050565b60006200017f825162000309565b6000601f82018313620001a657600080fd5b8151620001bd620001b782620002d5565b620002ae565b91508082526020830160208301858383011115620001da57600080fd5b620001e783828462000319565b50505092915050565b60006200017f82516200016e565b600080600080600060a086880312156200021757600080fd5b600062000225888862000171565b9550506020620002388882890162000186565b94505060408601516001604060020a038111156200025557600080fd5b620002638882890162000194565b93505060608601516001604060020a038111156200028057600080fd5b6200028e8882890162000194565b9250506080620002a188828901620001f0565b9150509295509295909350565b6040518181016001604060020a0381118282101715620002cd57600080fd5b604052919050565b60006001604060020a03821115620002ec57600080fd5b506020601f91909101601f19160190565b600160a060020a031690565b6000600382106200014d57600080fd5b60005b83811015620003365781810151838201526020016200031c565b8381111562000346576000848401525b50505050565b6110ef806200035c6000396000f3006080604052600436106200008a5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416632541c48481146200008f5780632bdd1ffe14620000a85780634225503314620000e55780636455e3ef14620000fd5780636ab0980e1462000124578063903443441462000150578063f6c868001462000175575b600080fd5b620000a6620000a03660046200074e565b6200019c565b005b348015620000b557600080fd5b50620000cd620000c736600462000704565b620002f3565b604051620000dc9190620008e4565b60405180910390f35b348015620000f257600080fd5b50620000cd62000311565b3480156200010a57600080fd5b506200011562000320565b604051620000dc919062000a01565b3480156200013157600080fd5b506200013c62000326565b604051620000dc9695949392919062000947565b3480156200015d57600080fd5b50620000a66200016f366004620007bb565b620004a1565b3480156200018257600080fd5b506200018d6200063c565b604051620000dc9190620009bb565b6000620001a86200063c565b1515620001ec576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001e390620009ef565b60405180910390fd5b6004546fffffffffffffffffffffffffffffffff8316023410156200023f576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001e390620009dd565b833084846200024d62000658565b6200025c9493929190620008fa565b604051809103906000f08015801562000279573d6000803e3d6000fd5b50600160a060020a03948516600090815260066020526040812080549690921673ffffffffffffffffffffffffffffffffffffffff1996871681179092556005805460018101825591527f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db001805490951617909355505050565b600160a060020a039081166000908152600660205260409020541690565b600054600160a060020a031690565b60045490565b60008054600354600454600180546040805160206002610100858716150260001901909416849004601f8101829004820283018201909352828252889760609788978a978897600160a060020a038516977401000000000000000000000000000000000000000090950460ff90811697929691959416938691830182828015620003f45780601f10620003c857610100808354040283529160200191620003f4565b820191906000526020600020905b815481529060010190602001808311620003d657829003601f168201915b5050865460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295995088945092508401905082828015620004865780601f106200045a5761010080835404028352916020019162000486565b820191906000526020600020905b8154815290600101906020018083116200046857829003601f168201915b50505050509250955095509550955095509550909192939495565b60008054604080517f34f0a6c80000000000000000000000000000000000000000000000000000000081529051600160a060020a03909216929183916334f0a6c891600480830192602092919082900301818787803b1580156200050457600080fd5b505af115801562000519573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506200053f91908101906200072d565b905080600160a060020a031663544697296040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156200059957600080fd5b505af1158015620005ae573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250620005d491908101906200072d565b600160a060020a0316331462000618576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001e390620009cb565b6003805484919060ff191660018360028111156200063257fe5b0217905550505050565b6000600160035460ff1660028111156200065257fe5b14905090565b6040516105af8062000b0783390190565b600062000677823562000a66565b9392505050565b600062000677825162000a66565b600062000677823562000aa0565b6000601f82018313620006ac57600080fd5b8135620006c3620006bd8262000a39565b62000a11565b91508082526020830160208301858383011115620006e057600080fd5b620006ed83828462000abd565b50505092915050565b600062000677823562000a88565b6000602082840312156200071757600080fd5b600062000725848462000669565b949350505050565b6000602082840312156200074057600080fd5b60006200072584846200067e565b6000806000606084860312156200076457600080fd5b600062000772868662000669565b935050602084013567ffffffffffffffff8111156200079057600080fd5b6200079e868287016200069a565b9250506040620007b186828701620006f6565b9150509250925092565b600060208284031215620007ce57600080fd5b60006200072584846200068c565b620007e78162000a66565b82525050565b620007e78162000a72565b620007e78162000ab0565b6000620008108262000a62565b8084526200082681602086016020860162000ac9565b620008318162000afc565b9093016020019392505050565b601581527f53656e646572206e6f7420617574686f72697a65640000000000000000000000602082015260400190565b601e81527f596f75206861766520746f2073656e6420656e6f756768206d6f6e65792e0000602082015260400190565b601181527f53656e736f72206e6f7420616374697665000000000000000000000000000000602082015260400190565b620007e78162000a88565b620007e78162000a9d565b60208101620008f48284620007dc565b92915050565b608081016200090a8287620007dc565b620009196020830186620007dc565b81810360408301526200092d818562000803565b90506200093e6060830184620008ce565b95945050505050565b60c08101620009578289620007dc565b620009666020830188620007f8565b81810360408301526200097a818762000803565b9050818103606083015262000990818662000803565b9050620009a16080830185620007f8565b620009b060a0830184620008d9565b979650505050505050565b60208101620008f48284620007ed565b60208082528101620008f4816200083e565b60208082528101620008f4816200086e565b60208082528101620008f4816200089e565b60208101620008f48284620008d9565b60405181810167ffffffffffffffff8111828210171562000a3157600080fd5b604052919050565b600067ffffffffffffffff82111562000a5157600080fd5b506020601f91909101601f19160190565b5190565b600160a060020a031690565b151590565b60006003821062000a8457fe5b5090565b6fffffffffffffffffffffffffffffffff1690565b90565b60006003821062000a8457600080fd5b6000620008f48262000a77565b82818337506000910152565b60005b8381101562000ae657818101518382015260200162000acc565b8381111562000af6576000848401525b50505050565b601f01601f1916905600608060405234801561001057600080fd5b506040516105af3803806105af833981018060405261003291908101906101ad565b60008054600160a060020a03808716600160a060020a0319928316179092556001805492861692909116919091179055815161007590600290602085019061009f565b50600380546001608060020a0319166001608060020a0392909216919091179055506102ba915050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100e057805160ff191683800117855561010d565b8280016001018555821561010d579182015b8281111561010d5782518255916020019190600101906100f2565b5061011992915061011d565b5090565b61013791905b808211156101195760008155600101610123565b90565b60006101468251610272565b9392505050565b6000601f8201831361015e57600080fd5b815161017161016c8261024b565b610225565b9150808252602083016020830185838301111561018d57600080fd5b61019883828461028a565b50505092915050565b6000610146825161027e565b600080600080608085870312156101c357600080fd5b60006101cf878761013a565b94505060206101e08782880161013a565b93505060408501516001604060020a038111156101fc57600080fd5b6102088782880161014d565b9250506060610219878288016101a1565b91505092959194509250565b6040518181016001604060020a038111828210171561024357600080fd5b604052919050565b60006001604060020a0382111561026157600080fd5b506020601f91909101601f19160190565b600160a060020a031690565b6001608060020a031690565b60005b838110156102a557818101518382015260200161028d565b838111156102b4576000848401525b50505050565b6102e6806102c96000396000f30060806040526004361061004b5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166378bc94c781146100505780637f9e10fb1461007e575b600080fd5b34801561005c57600080fd5b506100656100a0565b60405161007594939291906101fb565b60405180910390f35b34801561008a57600080fd5b5061009361017e565b60405161007591906101e7565b600080546001805460035460028054604080516020610100978416159790970260001901909216839004601f81018790048702830187019091528082528796606096889673ffffffffffffffffffffffffffffffffffffffff92831696921694936fffffffffffffffffffffffffffffffff9092169284918301828280156101695780601f1061013e57610100808354040283529160200191610169565b820191906000526020600020905b81548152906001019060200180831161014c57829003601f168201915b50505050509150935093509350935090919293565b60005473ffffffffffffffffffffffffffffffffffffffff1690565b6101a381610244565b82525050565b60006101b482610240565b8084526101c8816020860160208601610272565b6101d1816102a2565b9093016020019392505050565b6101a38161025d565b602081016101f5828461019a565b92915050565b60808101610209828761019a565b610216602083018661019a565b818103604083015261022881856101a9565b905061023760608301846101de565b95945050505050565b5190565b73ffffffffffffffffffffffffffffffffffffffff1690565b6fffffffffffffffffffffffffffffffff1690565b60005b8381101561028d578181015183820152602001610275565b8381111561029c576000848401525b50505050565b601f01601f1916905600a265627a7a723058204dedca6d9a35038ae8e8a0e887209587e778cc0f95cb448b2cb5f41570def5e26c6578706572696d656e74616cf50037a265627a7a72305820abe795ea2f7164e4be672371b5c8e8ed743222bc37a0c3dbd25024264d18c46d6c6578706572696d656e74616cf50037";

    public static final String FUNC_BUYDATASTREAM = "buyDataStream";

    public static final String FUNC_GETDATASTREAMSUBSCRIPTIONCONTRACTADDRESSFORDSE = "getDataStreamSubscriptionContractAddressForDSE";

    public static final String FUNC_GETDATASTREAMENTITYCONTRACTADDRESS = "getDataStreamEntityContractAddress";

    public static final String FUNC_GETPRICEPERDATAUNIT = "getPricePerDataUnit";

    public static final String FUNC_DESCRIBESENSOR = "describeSensor";

    public static final String FUNC_SETSENSORSTATUS = "setSensorStatus";

    public static final String FUNC_ISSENSORACTIVE = "isSensorActive";

    @Deprecated
    protected Sensor(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Sensor(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Sensor(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Sensor(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> buyDataStream(String _dataStreamEntityBayerContractAddress, String _startTimestamp, BigInteger _dataEntries, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_BUYDATASTREAM,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _dataStreamEntityBayerContractAddress),
                        new org.web3j.abi.datatypes.Utf8String(_startTimestamp),
                        new org.web3j.abi.datatypes.generated.Uint128(_dataEntries)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<String> getDataStreamSubscriptionContractAddressForDSE(String _dataStreamEntityContractAddress) {
        final Function function = new Function(FUNC_GETDATASTREAMSUBSCRIPTIONCONTRACTADDRESSFORDSE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _dataStreamEntityContractAddress)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> getDataStreamEntityContractAddress() {
        final Function function = new Function(FUNC_GETDATASTREAMENTITYCONTRACTADDRESS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> getPricePerDataUnit() {
        final Function function = new Function(FUNC_GETPRICEPERDATAUNIT,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {
                }));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple6<String, BigInteger, String, String, BigInteger, BigInteger>> describeSensor() {
        final Function function = new Function(FUNC_DESCRIBESENSOR,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }, new TypeReference<Uint8>() {
                }, new TypeReference<Utf8String>() {
                }, new TypeReference<Utf8String>() {
                }, new TypeReference<Uint8>() {
                }, new TypeReference<Uint256>() {
                }));
        return new RemoteFunctionCall<Tuple6<String, BigInteger, String, String, BigInteger, BigInteger>>(function,
                new Callable<Tuple6<String, BigInteger, String, String, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple6<String, BigInteger, String, String, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple6<String, BigInteger, String, String, BigInteger, BigInteger>(
                                (String) results.get(0).getValue(),
                                (BigInteger) results.get(1).getValue(),
                                (String) results.get(2).getValue(),
                                (String) results.get(3).getValue(),
                                (BigInteger) results.get(4).getValue(),
                                (BigInteger) results.get(5).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> setSensorStatus(BigInteger _sensorStatus) {
        final Function function = new Function(
                FUNC_SETSENSORSTATUS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint8(_sensorStatus)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> isSensorActive() {
        final Function function = new Function(FUNC_ISSENSORACTIVE,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static Sensor load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Sensor(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Sensor load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Sensor(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Sensor load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Sensor(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Sensor load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Sensor(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Sensor> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude, BigInteger _pricePerDataUnit) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _dataStreamEntityContractAddress),
                new org.web3j.abi.datatypes.generated.Uint8(_sensorType),
                new org.web3j.abi.datatypes.Utf8String(_latitude),
                new org.web3j.abi.datatypes.Utf8String(_longitude),
                new org.web3j.abi.datatypes.generated.Uint256(_pricePerDataUnit)));
        return deployRemoteCall(Sensor.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Sensor> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude, BigInteger _pricePerDataUnit) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _dataStreamEntityContractAddress),
                new org.web3j.abi.datatypes.generated.Uint8(_sensorType),
                new org.web3j.abi.datatypes.Utf8String(_latitude),
                new org.web3j.abi.datatypes.Utf8String(_longitude),
                new org.web3j.abi.datatypes.generated.Uint256(_pricePerDataUnit)));
        return deployRemoteCall(Sensor.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Sensor> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude, BigInteger _pricePerDataUnit) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _dataStreamEntityContractAddress),
                new org.web3j.abi.datatypes.generated.Uint8(_sensorType),
                new org.web3j.abi.datatypes.Utf8String(_latitude),
                new org.web3j.abi.datatypes.Utf8String(_longitude),
                new org.web3j.abi.datatypes.generated.Uint256(_pricePerDataUnit)));
        return deployRemoteCall(Sensor.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Sensor> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude, BigInteger _pricePerDataUnit) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _dataStreamEntityContractAddress),
                new org.web3j.abi.datatypes.generated.Uint8(_sensorType),
                new org.web3j.abi.datatypes.Utf8String(_latitude),
                new org.web3j.abi.datatypes.Utf8String(_longitude),
                new org.web3j.abi.datatypes.generated.Uint256(_pricePerDataUnit)));
        return deployRemoteCall(Sensor.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
