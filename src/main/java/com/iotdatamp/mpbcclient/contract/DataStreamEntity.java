package com.iotdatamp.mpbcclient.contract;

import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.*;
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
public class DataStreamEntity extends Contract {
    public static final String BINARY = "60806040523480156200001157600080fd5b5060405162002393380380620023938339810180604052620000379190810190620001ca565b60008054600160a060020a03808816600160a060020a031992831617909255600280549287169290911691909117905582516200007c906003906020860190620000b4565b50815162000092906004906020850190620000b4565b508051620000a8906005906020840190620000b4565b50505050505062000320565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10620000f757805160ff191683800117855562000127565b8280016001018555821562000127579182015b82811115620001275782518255916020019190600101906200010a565b506200013592915062000139565b5090565b6200015691905b8082111562000135576000815560010162000140565b90565b6000620001678251620002e1565b9392505050565b6000601f820183136200018057600080fd5b8151620001976200019182620002b9565b62000292565b91508082526020830160208301858383011115620001b457600080fd5b620001c1838284620002ed565b50505092915050565b600080600080600060a08688031215620001e357600080fd5b6000620001f1888862000159565b9550506020620002048882890162000159565b94505060408601516001604060020a038111156200022157600080fd5b6200022f888289016200016e565b93505060608601516001604060020a038111156200024c57600080fd5b6200025a888289016200016e565b92505060808601516001604060020a038111156200027757600080fd5b62000285888289016200016e565b9150509295509295909350565b6040518181016001604060020a0381118282101715620002b157600080fd5b604052919050565b60006001604060020a03821115620002d057600080fd5b506020601f91909101601f19160190565b600160a060020a031690565b60005b838110156200030a578181015183820152602001620002f0565b838111156200031a576000848401525b50505050565b61206380620003306000396000f3006080604052600436106200008a5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166334f0a6c881146200008f5780633a6a4d2e14620000bf5780635bb2189b14620000cb5780636d0749a514620000e2578063a4b825231462000109578063c054bce61462000130578063faa289ec146200015c575b600080fd5b3480156200009c57600080fd5b50620000a762000174565b604051620000b69190620009b6565b60405180910390f35b620000c962000183565b005b620000a7620000dc366004620007c3565b62000255565b348015620000ef57600080fd5b50620000fa6200044b565b604051620000b6919062000ab1565b3480156200011657600080fd5b5062000121620004af565b604051620000b6919062000ac4565b3480156200013d57600080fd5b5062000148620004c0565b604051620000b696959493929190620009cc565b3480156200016957600080fd5b50620000a762000716565b600054600160a060020a031690565b600254600160a060020a03163314620001d3576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001ca9062000ad4565b60405180910390fd5b60008054600154604051600160a060020a039092169281156108fc029290818181858888f193505050501580156200020f573d6000803e3d6000fd5b50600254600154604051600160a060020a039092169130319190910380156108fc02916000818181858888f1935050505015801562000252573d6000803e3d6000fd5b50565b60025460009081908190600160a060020a03163314620002a3576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001ca9062000ad4565b6000809054906101000a9004600160a060020a0316915081600160a060020a0316637c404c816040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156200031257600080fd5b505af115801562000327573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506200034d91908101906200085f565b34101562000389576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001ca9062000ae6565b60018054340190553087878787620003a062000725565b620003b095949392919062000a4d565b604051809103906000f080158015620003cd573d6000803e3d6000fd5b50600160a060020a0381166000818152600760205260408120805460ff191660019081179091556006805491820181559091527ff652222313e28459528d920b65115c16c04f3efc82aaedc97be59f3f377c0d3f01805473ffffffffffffffffffffffffffffffffffffffff19169091179055979650505050505050565b60606006805480602002602001604051908101604052809291908181526020018280548015620004a557602002820191906000526020600020905b8154600160a060020a0316815260019091019060200180831162000486575b5050505050905090565b600254600160a060020a0316331490565b600080546002805460038054604080516020601f60001960018616156101000201909416969096049283018690048602810186019091528181528695606095869586958695600160a060020a039485169592909416939092600492600592600692869190830182828015620005795780601f106200054d5761010080835404028352916020019162000579565b820191906000526020600020905b8154815290600101906020018083116200055b57829003601f168201915b5050865460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959950889450925084019050828280156200060b5780601f10620005df576101008083540402835291602001916200060b565b820191906000526020600020905b815481529060010190602001808311620005ed57829003601f168201915b5050855460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959850879450925084019050828280156200069d5780601f1062000671576101008083540402835291602001916200069d565b820191906000526020600020905b8154815290600101906020018083116200067f57829003601f168201915b5050505050915080805480602002602001604051908101604052809291908181526020018280548015620006fb57602002820191906000526020600020905b8154600160a060020a03168152600190910190602001808311620006dc575b50505050509050955095509550955095509550909192939495565b600254600160a060020a031690565b60405161144b8062000bdf83390190565b600062000744823562000b78565b9392505050565b6000601f820183136200075d57600080fd5b8135620007746200076e8262000b20565b62000af8565b915080825260208301602083018583830111156200079157600080fd5b6200079e83828462000b95565b50505092915050565b600062000744823562000b75565b600062000744825162000b75565b60008060008060808587031215620007da57600080fd5b6000620007e8878762000736565b945050602085013567ffffffffffffffff8111156200080657600080fd5b62000814878288016200074b565b935050604085013567ffffffffffffffff8111156200083257600080fd5b62000840878288016200074b565b92505060606200085387828801620007a7565b91505092959194509250565b6000602082840312156200087257600080fd5b6000620008808484620007b5565b949350505050565b620008938162000b53565b82525050565b6000620008a68262000b4f565b808452602084019350620008ba8362000b49565b60005b82811015620008f057620008d386835162000888565b620008de8262000b49565b602096909601959150600101620008bd565b5093949350505050565b620008938162000b5f565b620008938162000b88565b60006200091d8262000b4f565b8084526200093381602086016020860162000ba1565b6200093e8162000bd4565b9093016020019392505050565b601581527f53656e646572206e6f7420617574686f72697a65640000000000000000000000602082015260400190565b601e81527f596f75206861766520746f2073656e6420656e6f756768206d6f6e65792e0000602082015260400190565b620008938162000b75565b60208101620009c6828462000888565b92915050565b60c08101620009dc828962000888565b620009eb602083018862000888565b8181036040830152620009ff818762000910565b9050818103606083015262000a15818662000910565b9050818103608083015262000a2b818562000910565b905081810360a083015262000a41818462000899565b98975050505050505050565b60a0810162000a5d828862000888565b62000a6c602083018762000905565b818103604083015262000a80818662000910565b9050818103606083015262000a96818562000910565b905062000aa76080830184620009ab565b9695505050505050565b6020808252810162000744818462000899565b60208101620009c68284620008fa565b60208082528101620009c6816200094b565b60208082528101620009c6816200097b565b60405181810167ffffffffffffffff8111828210171562000b1857600080fd5b604052919050565b600067ffffffffffffffff82111562000b3857600080fd5b506020601f91909101601f19160190565b60200190565b5190565b600160a060020a031690565b151590565b60006003821062000b7157fe5b5090565b90565b60006003821062000b7157600080fd5b6000620009c68262000b64565b82818337506000910152565b60005b8381101562000bbe57818101518382015260200162000ba4565b8381111562000bce576000848401525b50505050565b601f01601f191690560060806040523480156200001157600080fd5b506040516200144b3803806200144b8339810180604052620000379190810190620001fe565b60008054600160a060020a031916600160a060020a0387161780825585919060a060020a60ff021916740100000000000000000000000000000000000000008360028111156200008357fe5b021790555082516200009d906001906020860190620000cc565b508151620000b3906002906020850190620000cc565b5060045550506003805460ff19169055506200034c9050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200010f57805160ff19168380011785556200013f565b828001600101855582156200013f579182015b828111156200013f57825182559160200191906001019062000122565b506200014d92915062000151565b5090565b6200016e91905b808211156200014d576000815560010162000158565b90565b60006200017f8251620002fd565b9392505050565b60006200017f825162000309565b6000601f82018313620001a657600080fd5b8151620001bd620001b782620002d5565b620002ae565b91508082526020830160208301858383011115620001da57600080fd5b620001e783828462000319565b50505092915050565b60006200017f82516200016e565b600080600080600060a086880312156200021757600080fd5b600062000225888862000171565b9550506020620002388882890162000186565b94505060408601516001604060020a038111156200025557600080fd5b620002638882890162000194565b93505060608601516001604060020a038111156200028057600080fd5b6200028e8882890162000194565b9250506080620002a188828901620001f0565b9150509295509295909350565b6040518181016001604060020a0381118282101715620002cd57600080fd5b604052919050565b60006001604060020a03821115620002ec57600080fd5b506020601f91909101601f19160190565b600160a060020a031690565b6000600382106200014d57600080fd5b60005b83811015620003365781810151838201526020016200031c565b8381111562000346576000848401525b50505050565b6110ef806200035c6000396000f3006080604052600436106200008a5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416632541c48481146200008f5780632bdd1ffe14620000a85780634225503314620000e55780636455e3ef14620000fd5780636ab0980e1462000124578063903443441462000150578063f6c868001462000175575b600080fd5b620000a6620000a03660046200074e565b6200019c565b005b348015620000b557600080fd5b50620000cd620000c736600462000704565b620002f3565b604051620000dc9190620008e4565b60405180910390f35b348015620000f257600080fd5b50620000cd62000311565b3480156200010a57600080fd5b506200011562000320565b604051620000dc919062000a01565b3480156200013157600080fd5b506200013c62000326565b604051620000dc9695949392919062000947565b3480156200015d57600080fd5b50620000a66200016f366004620007bb565b620004a1565b3480156200018257600080fd5b506200018d6200063c565b604051620000dc9190620009bb565b6000620001a86200063c565b1515620001ec576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001e390620009ef565b60405180910390fd5b6004546fffffffffffffffffffffffffffffffff8316023410156200023f576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001e390620009dd565b833084846200024d62000658565b6200025c9493929190620008fa565b604051809103906000f08015801562000279573d6000803e3d6000fd5b50600160a060020a03948516600090815260066020526040812080549690921673ffffffffffffffffffffffffffffffffffffffff1996871681179092556005805460018101825591527f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db001805490951617909355505050565b600160a060020a039081166000908152600660205260409020541690565b600054600160a060020a031690565b60045490565b60008054600354600454600180546040805160206002610100858716150260001901909416849004601f8101829004820283018201909352828252889760609788978a978897600160a060020a038516977401000000000000000000000000000000000000000090950460ff90811697929691959416938691830182828015620003f45780601f10620003c857610100808354040283529160200191620003f4565b820191906000526020600020905b815481529060010190602001808311620003d657829003601f168201915b5050865460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295995088945092508401905082828015620004865780601f106200045a5761010080835404028352916020019162000486565b820191906000526020600020905b8154815290600101906020018083116200046857829003601f168201915b50505050509250955095509550955095509550909192939495565b60008054604080517f34f0a6c80000000000000000000000000000000000000000000000000000000081529051600160a060020a03909216929183916334f0a6c891600480830192602092919082900301818787803b1580156200050457600080fd5b505af115801562000519573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506200053f91908101906200072d565b905080600160a060020a031663544697296040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156200059957600080fd5b505af1158015620005ae573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250620005d491908101906200072d565b600160a060020a0316331462000618576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401620001e390620009cb565b6003805484919060ff191660018360028111156200063257fe5b0217905550505050565b6000600160035460ff1660028111156200065257fe5b14905090565b6040516105af8062000b0783390190565b600062000677823562000a66565b9392505050565b600062000677825162000a66565b600062000677823562000aa0565b6000601f82018313620006ac57600080fd5b8135620006c3620006bd8262000a39565b62000a11565b91508082526020830160208301858383011115620006e057600080fd5b620006ed83828462000abd565b50505092915050565b600062000677823562000a88565b6000602082840312156200071757600080fd5b600062000725848462000669565b949350505050565b6000602082840312156200074057600080fd5b60006200072584846200067e565b6000806000606084860312156200076457600080fd5b600062000772868662000669565b935050602084013567ffffffffffffffff8111156200079057600080fd5b6200079e868287016200069a565b9250506040620007b186828701620006f6565b9150509250925092565b600060208284031215620007ce57600080fd5b60006200072584846200068c565b620007e78162000a66565b82525050565b620007e78162000a72565b620007e78162000ab0565b6000620008108262000a62565b8084526200082681602086016020860162000ac9565b620008318162000afc565b9093016020019392505050565b601581527f53656e646572206e6f7420617574686f72697a65640000000000000000000000602082015260400190565b601e81527f596f75206861766520746f2073656e6420656e6f756768206d6f6e65792e0000602082015260400190565b601181527f53656e736f72206e6f7420616374697665000000000000000000000000000000602082015260400190565b620007e78162000a88565b620007e78162000a9d565b60208101620008f48284620007dc565b92915050565b608081016200090a8287620007dc565b620009196020830186620007dc565b81810360408301526200092d818562000803565b90506200093e6060830184620008ce565b95945050505050565b60c08101620009578289620007dc565b620009666020830188620007f8565b81810360408301526200097a818762000803565b9050818103606083015262000990818662000803565b9050620009a16080830185620007f8565b620009b060a0830184620008d9565b979650505050505050565b60208101620008f48284620007ed565b60208082528101620008f4816200083e565b60208082528101620008f4816200086e565b60208082528101620008f4816200089e565b60208101620008f48284620008d9565b60405181810167ffffffffffffffff8111828210171562000a3157600080fd5b604052919050565b600067ffffffffffffffff82111562000a5157600080fd5b506020601f91909101601f19160190565b5190565b600160a060020a031690565b151590565b60006003821062000a8457fe5b5090565b6fffffffffffffffffffffffffffffffff1690565b90565b60006003821062000a8457600080fd5b6000620008f48262000a77565b82818337506000910152565b60005b8381101562000ae657818101518382015260200162000acc565b8381111562000af6576000848401525b50505050565b601f01601f1916905600608060405234801561001057600080fd5b506040516105af3803806105af833981018060405261003291908101906101ad565b60008054600160a060020a03808716600160a060020a0319928316179092556001805492861692909116919091179055815161007590600290602085019061009f565b50600380546001608060020a0319166001608060020a0392909216919091179055506102ba915050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100e057805160ff191683800117855561010d565b8280016001018555821561010d579182015b8281111561010d5782518255916020019190600101906100f2565b5061011992915061011d565b5090565b61013791905b808211156101195760008155600101610123565b90565b60006101468251610272565b9392505050565b6000601f8201831361015e57600080fd5b815161017161016c8261024b565b610225565b9150808252602083016020830185838301111561018d57600080fd5b61019883828461028a565b50505092915050565b6000610146825161027e565b600080600080608085870312156101c357600080fd5b60006101cf878761013a565b94505060206101e08782880161013a565b93505060408501516001604060020a038111156101fc57600080fd5b6102088782880161014d565b9250506060610219878288016101a1565b91505092959194509250565b6040518181016001604060020a038111828210171561024357600080fd5b604052919050565b60006001604060020a0382111561026157600080fd5b506020601f91909101601f19160190565b600160a060020a031690565b6001608060020a031690565b60005b838110156102a557818101518382015260200161028d565b838111156102b4576000848401525b50505050565b6102e6806102c96000396000f30060806040526004361061004b5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166378bc94c781146100505780637f9e10fb1461007e575b600080fd5b34801561005c57600080fd5b506100656100a0565b60405161007594939291906101fb565b60405180910390f35b34801561008a57600080fd5b5061009361017e565b60405161007591906101e7565b600080546001805460035460028054604080516020610100978416159790970260001901909216839004601f81018790048702830187019091528082528796606096889673ffffffffffffffffffffffffffffffffffffffff92831696921694936fffffffffffffffffffffffffffffffff9092169284918301828280156101695780601f1061013e57610100808354040283529160200191610169565b820191906000526020600020905b81548152906001019060200180831161014c57829003601f168201915b50505050509150935093509350935090919293565b60005473ffffffffffffffffffffffffffffffffffffffff1690565b6101a381610244565b82525050565b60006101b482610240565b8084526101c8816020860160208601610272565b6101d1816102a2565b9093016020019392505050565b6101a38161025d565b602081016101f5828461019a565b92915050565b60808101610209828761019a565b610216602083018661019a565b818103604083015261022881856101a9565b905061023760608301846101de565b95945050505050565b5190565b73ffffffffffffffffffffffffffffffffffffffff1690565b6fffffffffffffffffffffffffffffffff1690565b60005b8381101561028d578181015183820152602001610275565b8381111561029c576000848401525b50505050565b601f01601f1916905600a265627a7a723058204dedca6d9a35038ae8e8a0e887209587e778cc0f95cb448b2cb5f41570def5e26c6578706572696d656e74616cf50037a265627a7a72305820abe795ea2f7164e4be672371b5c8e8ed743222bc37a0c3dbd25024264d18c46d6c6578706572696d656e74616cf50037a265627a7a72305820b027995e162bcd56cd2eab23612022ab693c842373268085b2df0da57616ab2a6c6578706572696d656e74616cf50037";

    public static final String FUNC_GETIOTDATAMARKETPLACECONTRACTADDRESS = "getIotDataMarketplaceContractAddress";

    public static final String FUNC_DISTRIBUTEFUNDS = "distributeFunds";

    public static final String FUNC_REGISTERNEWSENSOR = "registerNewSensor";

    public static final String FUNC_GETSENSORS = "getSensors";

    public static final String FUNC_ISAUTHENTICATED = "isAuthenticated";

    public static final String FUNC_DESCRIBEDATASTREAMENTITY = "describeDataStreamEntity";

    public static final String FUNC_GETDATASTREAMENTITYOWNERADDRESS = "getDataStreamEntityOwnerAddress";

    @Deprecated
    protected DataStreamEntity(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected DataStreamEntity(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected DataStreamEntity(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected DataStreamEntity(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> getIotDataMarketplaceContractAddress() {
        final Function function = new Function(FUNC_GETIOTDATAMARKETPLACECONTRACTADDRESS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> distributeFunds(BigInteger weiValue) {
        final Function function = new Function(
                FUNC_DISTRIBUTEFUNDS,
                Arrays.<Type>asList(),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<TransactionReceipt> registerNewSensor(BigInteger _sensorType, String _latitude, String _longitude, BigInteger _pricePerDataUnit, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_REGISTERNEWSENSOR,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint8(_sensorType),
                        new Utf8String(_latitude),
                        new Utf8String(_longitude),
                        new org.web3j.abi.datatypes.generated.Uint256(_pricePerDataUnit)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<List> getSensors() {
        final Function function = new Function(FUNC_GETSENSORS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {
                }));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<Boolean> isAuthenticated() {
        final Function function = new Function(FUNC_ISAUTHENTICATED,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Tuple6<String, String, String, String, String, List<String>>> describeDataStreamEntity() {
        final Function function = new Function(FUNC_DESCRIBEDATASTREAMENTITY,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }, new TypeReference<Address>() {
                }, new TypeReference<Utf8String>() {
                }, new TypeReference<Utf8String>() {
                }, new TypeReference<Utf8String>() {
                }, new TypeReference<DynamicArray<Address>>() {
                }));
        return new RemoteFunctionCall<Tuple6<String, String, String, String, String, List<String>>>(function,
                new Callable<Tuple6<String, String, String, String, String, List<String>>>() {
                    @Override
                    public Tuple6<String, String, String, String, String, List<String>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple6<String, String, String, String, String, List<String>>(
                                (String) results.get(0).getValue(),
                                (String) results.get(1).getValue(),
                                (String) results.get(2).getValue(),
                                (String) results.get(3).getValue(),
                                (String) results.get(4).getValue(),
                                convertToNative((List<Address>) results.get(5).getValue()));
                    }
                });
    }

    public RemoteFunctionCall<String> getDataStreamEntityOwnerAddress() {
        final Function function = new Function(FUNC_GETDATASTREAMENTITYOWNERADDRESS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static DataStreamEntity load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DataStreamEntity(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static DataStreamEntity load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DataStreamEntity(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static DataStreamEntity load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new DataStreamEntity(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DataStreamEntity load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new DataStreamEntity(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<DataStreamEntity> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _iotDataMarketplaceContractAddress, String _dataStreamEntityOwnerAddress, String _name, String _url, String _email) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _iotDataMarketplaceContractAddress),
                new Address(160, _dataStreamEntityOwnerAddress),
                new Utf8String(_name),
                new Utf8String(_url),
                new Utf8String(_email)));
        return deployRemoteCall(DataStreamEntity.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<DataStreamEntity> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _iotDataMarketplaceContractAddress, String _dataStreamEntityOwnerAddress, String _name, String _url, String _email) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _iotDataMarketplaceContractAddress),
                new Address(160, _dataStreamEntityOwnerAddress),
                new Utf8String(_name),
                new Utf8String(_url),
                new Utf8String(_email)));
        return deployRemoteCall(DataStreamEntity.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<DataStreamEntity> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _iotDataMarketplaceContractAddress, String _dataStreamEntityOwnerAddress, String _name, String _url, String _email) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _iotDataMarketplaceContractAddress),
                new Address(160, _dataStreamEntityOwnerAddress),
                new Utf8String(_name),
                new Utf8String(_url),
                new Utf8String(_email)));
        return deployRemoteCall(DataStreamEntity.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<DataStreamEntity> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _iotDataMarketplaceContractAddress, String _dataStreamEntityOwnerAddress, String _name, String _url, String _email) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _iotDataMarketplaceContractAddress),
                new Address(160, _dataStreamEntityOwnerAddress),
                new Utf8String(_name),
                new Utf8String(_url),
                new Utf8String(_email)));
        return deployRemoteCall(DataStreamEntity.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
