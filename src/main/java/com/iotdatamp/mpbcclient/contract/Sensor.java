package com.iotdatamp.mpbcclient.contract;

import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple5;
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
    public static final String BINARY = "60806040523480156200001157600080fd5b5060405162000918380380620009188339810180604052620000379190810190620001ed565b60008054600160a060020a031916600160a060020a0386161780825584919060a060020a60ff021916740100000000000000000000000000000000000000008360028111156200008357fe5b021790555081516200009d906001906020850190620000c9565b508051620000b3906002906020840190620000c9565b50506003805460ff191690555062000325915050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200010c57805160ff19168380011785556200013c565b828001600101855582156200013c579182015b828111156200013c5782518255916020019190600101906200011f565b506200014a9291506200014e565b5090565b6200016b91905b808211156200014a576000815560010162000155565b90565b60006200017c8251620002d6565b9392505050565b60006200017c8251620002e2565b6000601f82018313620001a357600080fd5b8151620001ba620001b482620002ae565b62000287565b91508082526020830160208301858383011115620001d757600080fd5b620001e4838284620002f2565b50505092915050565b600080600080608085870312156200020457600080fd5b60006200021287876200016e565b9450506020620002258782880162000183565b93505060408501516001604060020a038111156200024257600080fd5b620002508782880162000191565b92505060608501516001604060020a038111156200026d57600080fd5b6200027b8782880162000191565b91505092959194509250565b6040518181016001604060020a0381118282101715620002a657600080fd5b604052919050565b60006001604060020a03821115620002c557600080fd5b506020601f91909101601f19160190565b600160a060020a031690565b6000600382106200014a57600080fd5b60005b838110156200030f578181015183820152602001620002f5565b838111156200031f576000848401525b50505050565b6105e380620003356000396000f30060806040526004361061004b5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416636ab0980e8114610050578063903443441461007f575b600080fd5b34801561005c57600080fd5b506100656100a1565b6040516100769594939291906104b8565b60405180910390f35b34801561008b57600080fd5b5061009f61009a36600461041d565b610219565b005b60008054600354600180546040805160206002610100858716150260001901909416849004601f810182900482028301820190935282825287966060968796899673ffffffffffffffffffffffffffffffffffffffff8416967401000000000000000000000000000000000000000090940460ff908116969295919493169285918301828280156101735780601f1061014857610100808354040283529160200191610173565b820191906000526020600020905b81548152906001019060200180831161015657829003601f168201915b5050855460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959850879450925084019050828280156102015780601f106101d657610100808354040283529160200191610201565b820191906000526020600020905b8154815290600101906020018083116101e457829003601f168201915b50505050509150945094509450945094509091929394565b60008054604080517f2e43eead000000000000000000000000000000000000000000000000000000008152905173ffffffffffffffffffffffffffffffffffffffff90921692918391632e43eead91600480830192602092919082900301818787803b15801561028857600080fd5b505af115801561029c573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506102c091908101906103f7565b90508073ffffffffffffffffffffffffffffffffffffffff1663544697296040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15801561032657600080fd5b505af115801561033a573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525061035e91908101906103f7565b73ffffffffffffffffffffffffffffffffffffffff1633146103b5576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016103ac90610512565b60405180910390fd5b6003805484919060ff191660018360028111156103ce57fe5b0217905550505050565b60006103e4825161052c565b9392505050565b60006103e48235610555565b60006020828403121561040957600080fd5b600061041584846103d8565b949350505050565b60006020828403121561042f57600080fd5b600061041584846103eb565b6104448161052c565b82525050565b61044481610564565b600061045e82610528565b80845261047281602086016020860161056f565b61047b8161059f565b9093016020019392505050565b601581527f53656e646572206e6f7420617574686f72697a65640000000000000000000000602082015260400190565b60a081016104c6828861043b565b6104d3602083018761044a565b81810360408301526104e58186610453565b905081810360608301526104f98185610453565b9050610508608083018461044a565b9695505050505050565b6020808252810161052281610488565b92915050565b5190565b73ffffffffffffffffffffffffffffffffffffffff1690565b60006003821061055157fe5b5090565b60006003821061055157600080fd5b600061052282610545565b60005b8381101561058a578181015183820152602001610572565b83811115610599576000848401525b50505050565b601f01601f1916905600a265627a7a7230582063a77a8e94cff40526a1d67a15e8ca10a7582084e1bb6cac50286bc4a36eaa586c6578706572696d656e74616cf50037";

    public static final String FUNC_DESCRIBESENSOR = "describeSensor";

    public static final String FUNC_SETSENSORSTATUS = "setSensorStatus";

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

    public RemoteFunctionCall<Tuple5<String, BigInteger, String, String, BigInteger>> describeSensor() {
        final Function function = new Function(FUNC_DESCRIBESENSOR,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }, new TypeReference<Uint8>() {
                }, new TypeReference<Utf8String>() {
                }, new TypeReference<Utf8String>() {
                }, new TypeReference<Uint8>() {
                }));
        return new RemoteFunctionCall<Tuple5<String, BigInteger, String, String, BigInteger>>(function,
                new Callable<Tuple5<String, BigInteger, String, String, BigInteger>>() {
                    @Override
                    public Tuple5<String, BigInteger, String, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<String, BigInteger, String, String, BigInteger>(
                                (String) results.get(0).getValue(),
                                (BigInteger) results.get(1).getValue(),
                                (String) results.get(2).getValue(),
                                (String) results.get(3).getValue(),
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> setSensorStatus(BigInteger _sensorStatus) {
        final Function function = new Function(
                FUNC_SETSENSORSTATUS,
                Arrays.<Type>asList(new Uint8(_sensorStatus)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
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

    public static RemoteCall<Sensor> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _dataStreamEntityContractAddress),
                new Uint8(_sensorType),
                new Utf8String(_latitude),
                new Utf8String(_longitude)));
        return deployRemoteCall(Sensor.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Sensor> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _dataStreamEntityContractAddress),
                new Uint8(_sensorType),
                new Utf8String(_latitude),
                new Utf8String(_longitude)));
        return deployRemoteCall(Sensor.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Sensor> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _dataStreamEntityContractAddress),
                new Uint8(_sensorType),
                new Utf8String(_latitude),
                new Utf8String(_longitude)));
        return deployRemoteCall(Sensor.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Sensor> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _dataStreamEntityContractAddress, BigInteger _sensorType, String _latitude, String _longitude) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _dataStreamEntityContractAddress),
                new Uint8(_sensorType),
                new Utf8String(_latitude),
                new Utf8String(_longitude)));
        return deployRemoteCall(Sensor.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
