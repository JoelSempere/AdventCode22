package day3;

import java.util.ArrayList;
import java.util.List;

public class Day3 {
    public static void main(String[] args) {
        String data = "vGFhvGvvSdfwqhqvmCPnlFPnCNPcCFcWcr\n" +
                "ZbWZDMgsTHsrNNLJcJnsJl\n" +
                "HbBWQgZVZZBzbgZphwjqpmmVfdGmjG\n" +
                "vvCJLGnthChvtrvCCnRbTRqRPRBtbTRfPRRl\n" +
                "djZSgHNNwjqcdWlbcbfc\n" +
                "pFgMSfpMfzMDZFSgSjGJQQnCvMCVLnnJQLGC\n" +
                "gVhQWQpcWZVwwHVvFvnnnnDFdL\n" +
                "lzbPlztjltztzSjfGcPdTHLTHFCnnHCLndFGGd\n" +
                "jsNbzbczclttSlfbqlljRQMJRMMpJwRZhspZgJRM\n" +
                "hLJvfGcNDttSGvJtvSSJcqbqFBBWbjQqDrqbjDDjjb\n" +
                "lTswlzZdssgFpdPwZpMQnCjngCCjWBQBWWQqng\n" +
                "PRZMpzPZTdVZTfJvFvLFRctJcf\n" +
                "JHbQtHVHHLLbTJmmZddgdgwhllMNhhhTgg\n" +
                "spqpNGDjDPMhCFChMj\n" +
                "DBSDDGnpSDsDWqWczcvSqWvsBtJJLLZrRVZLJRbBZNVrBHrV\n" +
                "GwGhfhPhpHccvwSwrTsmsCjDmqTfbDqjss\n" +
                "tQntQcNRJMFnnVQFFctJqCsRmsTjjbDqDlTqTbWT\n" +
                "NZdVBZZNFzMFNNNvGprZcLGPGrrpcP\n" +
                "SvCPLrrlCSvZLrCPPBNPRvNLQBbpmbdggQTTfpfQgpgTqbbb\n" +
                "HVjHwMVwWtdMGwtwMwdhDFgbJgJqTmFMfFfmmfTTpq\n" +
                "whtHVcjDtHWtsWdwVGVHthDPzRrNSsCRLrLRlZNzZSNzNR\n" +
                "rjrlCCBtbtntwPPt\n" +
                "FvfJHqBJQWWgWgWLwnMwMLbzvhwTTp\n" +
                "WqHgWqBFgGfQgHfVdQFfVfrDllSsRSDmVmRCZZmSSSSZ\n" +
                "gjnppCgGHNPrqqmFnnbr\n" +
                "tGltVlJRtLRlrqcJcqZDqBJc\n" +
                "VvhLlvWltWdVltRTLTfgwSjGNHhggQNQNjps\n" +
                "HDWjCNfQjmwgWhcwPPVbZGcpMb\n" +
                "sFltFBRRSRJBSSsBlSSnRLPZbVGMVPZpMpPZpcMrFZMc\n" +
                "BLTBsstlqBRRBSvJJBsHdgdDNHCQHvbdCjQNNW\n" +
                "lRGzWLZNFwJVbVVGcJ\n" +
                "HqqpjPvHQnJgVgTnbdTV\n" +
                "rVvjBQHQrQhCrzlzWrRlDZ\n" +
                "jZjTZRSjZnhGZhzGnG\n" +
                "HbnPHrCbBDMnhcrVLWWLLWWg\n" +
                "MBwbCNDDptwNMttjdSnsqSRSFFdjtj\n" +
                "bSfvcsNsDdccHHQm\n" +
                "ljrlplvBhDHDHHHHJl\n" +
                "jgpzhrzRrvhFRFrzFnWfZtTwSWZPbbqNbsTqsW\n" +
                "vvCTvcDzHcgtvWjvcDcvgBCgwTdPFPpwpwmTSwwmdPwZpfZh\n" +
                "rNLMNVqLGNrVsRNJNsPnGnnfnpSFGdfddndd\n" +
                "VPQsMbVsPbzzvgCzgv\n" +
                "wPsrqprHQQZsChZn\n" +
                "cjgFLwWDlDltfLmTCnmWCnZZChCQ\n" +
                "FccccSLGFwjVlfVLLtgdSPSpMpBMdMBRRdHdBp\n" +
                "mQQcpmCCprrfLQqZVGqLGv\n" +
                "PtsJdsMtTTTvFqLTnnqbGZ\n" +
                "HjldthsHWztJzstZhBcHDDgpNpCpmrpgSD\n" +
                "lCmhDljDJgWggcnh\n" +
                "LdQrbdTDQGfGLPdqqFrHwRJcWRHgHBWHBJ\n" +
                "sLqsGtDqdGQfSTsqtfqqVMzjCzlvllZljNpCsMMl\n" +
                "CfLCZCCqqHlhSSrrtpRjpL\n" +
                "mWQbnQZVTWwNdwmDSbpbrFptjDrjRj\n" +
                "PJWVnTWPVnnclqqBsCCZHP\n" +
                "tqvtbNCgqJSgZgZvSncrrcGjBGhcnVcR\n" +
                "DswGQQQdRcjBnRDn\n" +
                "sMdlFMQQpfZbvlNtZGgN\n" +
                "RMlPllHtrlrlcZLsZfLcfwdDGD\n" +
                "QppnQhTBgwQDJsGzLQ\n" +
                "gTjnmjvphDSNMbtMbtMRHNVr\n" +
                "RHHcChrVVChCWQmRnMZmnmbTbGmFnqTT\n" +
                "gpzpfpszDwvDDNdwjdstnSMMHGMqvZnFTTZqbq\n" +
                "DsDdpfppwHsgJdjzfdDjdssLPlRccPQQrJcchPQWWQRhlQcr\n" +
                "rsrjQjnRnQZZqMmMMVqs\n" +
                "WTSTdvJLvTGJTGCMGvzBBpVVqqFVzBzVmf\n" +
                "tTSJhGLJbJhLJRRbHPQbnHHMrl\n" +
                "GGgMgBJHWHhLWMhWhgfrhgWLzmsmlzTtzHmsmlszRtszRVlT\n" +
                "bvScppfcQfcQSFCQpnPqwwTdRTvmzVssvswtddsv\n" +
                "ZDpqnPbQbPPnQbFbfSPSqbQJhGrjgMZBhWLrLrBBBBJWhg\n" +
                "hQCCGCNhDmGFJsTt\n" +
                "fcggBBpvBSrtsRTpRmpD\n" +
                "wflWlBlfnvfWWgMNPPLhPnzhPmLQ\n" +
                "pcGGTvVpcQLLzSPPPpVBVQwngNqgsJqgJgqSngsJMqJg\n" +
                "RZDFGhtCDGmWfWsNdwJhnMgwswqJ\n" +
                "ZCGjRGjZllFGHvvcTPjPTQpB\n" +
                "FDVsWrFZnnnfNRJdgBBBMLsJLH\n" +
                "wcThcTphvCThwTlblpzwGlpLRgHJWLgHLBHdHWJLBLWR\n" +
                "mwcbPmClwlzlwvvbTmWbQSjZmZSrDnSNVZfVFnZf\n" +
                "tMlttlFRSrcSFcwQSRwSzrMMPPGGPGLWgNfTNTcLPNPGBPPG\n" +
                "pbZVCDTqnCjVDHnHVnhBPBBbhBhbhgLgmWLh\n" +
                "qZCJZJqqjjCVvvRQltlzTrJtMMMw\n" +
                "QvvdBDdMbdFFJrMMjjmjCfCntC\n" +
                "lHTPsNLPcfVZLnfj\n" +
                "GgsWpHPpTPWpNsGvgdnDbQRQFRbdQg\n" +
                "jPNwllsVZjhslSjwGShZMdJDmmdmWLtMDDPHMPFd\n" +
                "QbvpDrbBrtMbbHJmcH\n" +
                "vznvzBRpBprQBqQZjNswwZDnSlGjZl\n" +
                "PdNTzLQPLrVMzGcMtt\n" +
                "FsSvDrvmrwDggHGwgV\n" +
                "vlpZpZmfnmFTlTWJWdbrdh\n" +
                "mZmnggMTSJrrmnrbmTbngJMtwPvwzzRvPGhQdGZPGPLvGvRd\n" +
                "FFVBNHVlFlDfCsWwLwPzzhGPCvzhQv\n" +
                "qBHLsDcfqFfDDfsFLNcNNBFsrgpMpnJSbnmTnrtmbMSqnpnr\n" +
                "qjBNwBPNPspqddssbsTsMDhTDrThQb\n" +
                "gvzZSZzFbgHnrHmn\n" +
                "fcvfZcRSZFGfZcvFbGttcPfpVjWVwqBqdwNdwNNpqV\n" +
                "RrTmtTrqznrnRCSqJrWlWDbhWVnfVDVWdclV\n" +
                "QBBgHQGvHHQswLHQQLGLHdLhfhlZZFlsscVDZfWfDhVlZZ\n" +
                "dLBMPpGPjLHPHPBHjjgQjHQztSJRztmrNCSCmSpmprrrrz\n" +
                "HHWJgjjsJrPBWBjgWgDvbbvtbNDNVtttMPPp\n" +
                "SnLTlhhNSntRVVLFVbbb\n" +
                "ChqdcNTNqqJCrQrQrrBC\n" +
                "BvfLLngFLDrrlDFDDnGmGlmzqzdGqMMWWwWW\n" +
                "RVsPbsbVZbjctccCcsCSPmdNqMqMWddwqVzhhNHwHd\n" +
                "tcsjPZRctZTSbbtSbtsSjZznnJfJBrfJgLvJJDDBvpTrgp\n" +
                "LJJsNdtJQtbWRJQttjGhjVnjcnzcsczGqj\n" +
                "MDPPlvCwrTlZfMMvTlPTdVcVhVVjchSBrjccSnnq\n" +
                "lgZCvTTZfMgHLptdRgmR\n" +
                "gCDrJRNgJDZRCwMgqGbtVVjTjlFbbTtR\n" +
                "mccnfcnSQScdvdcQQQpWdnWSjPqTbFFlbPqbPVGNjTPjtN\n" +
                "NnzmpWmBBzzpzDgwhDghrZrw\n" +
                "wcbVDBQwVBFQLFQDQcqQcLcJfpHJjmljGgMHfcfgGgjf\n" +
                "PtnWMtSnlgJmWWmm\n" +
                "nThPtRnzntstvrtRPqDFLMLdDwBBFLQDBT\n" +
                "zshqnVqTwqHqZQgZDSZjpFjFFF\n" +
                "PsBRvttdcgFFBSmc\n" +
                "GlPsbLtrvrrrtJlCTnVTlwwfnhwVqH\n" +
                "CvVVnFwWZnZwJZMNlCMNMpbMrrQG\n" +
                "cpghqzqqtzbGMjTNclGN\n" +
                "PqLBsgqBsSfBffShVmvRVwWsFpwZVpsn\n" +
                "LzsLSScvscqNdGdgddQjCDbzhpCDbRbhDpDDwDwt\n" +
                "ZlMBBBnlMFVFHVMJflJjJBfhRnCbCDpRttRPDCbWpCRbpW\n" +
                "mlrFmJrmscNGmsjm\n" +
                "FqQjLRjfvTFvlPHHNPMBDDNDPR\n" +
                "chWptpcWTzBPMsMMMBHW\n" +
                "zcJghwJZpZcgnctccdzzpGQrbQbblFFlTCCFTbdCFCFq\n" +
                "QcwNpCcQzpwtCGPPPnrGrfHfvN\n" +
                "FgjhhhjMVFVjqRRqDBVBqvMZvdrHnPZWZvsnZHdWnv\n" +
                "ShBFhDVghhTBgBBFRRgRCmCPCcpPbwCmLTcCmbpb\n" +
                "ZzlzsBzZnWnsBhFRvfvvLfWqfvMv\n" +
                "GgQGjjddHHPwpHpTGjPdHMvtvwJqLtJRFlRFRqMwLc\n" +
                "dgbbdjpGGgTHGGgQgdpmpgblrBrhrhCBSSznChsVhBsmNB\n" +
                "PhSwPdnpsmSWWcjjDFNqnc\n" +
                "GJGCTLbTZTrlfflVLFchHDHHDFcVVN\n" +
                "RhlhrllQZhCsPvRBvMtSvw\n" +
                "GVgnrgTWGVGjLVjWSpvvNmPTmpQmzvhf\n" +
                "tBbBDsFtszzSSbPZbh\n" +
                "BqlqdcqSJtFMdMjWrnGCWRrWGG\n" +
                "sJVJsQhMhPPSQMwdHRmmsmmwRmsr\n" +
                "zLFjLDTBFNWWwrqrffldlRdFRq\n" +
                "BLjzjTpzLpzWGTbQpMJvVMQwQhhMQM\n" +
                "RqSztDRhJDLmRMLlfvsP\n" +
                "dMdMMHZCsnbdvmbP\n" +
                "VHcZVVcZTwTQpgHQcgFMFBpDDzBqqqDhqJSjSjJjSD\n" +
                "rdMnMGjdHhfnjqWWDJPpGWPtvW\n" +
                "PTBSQSSzZSBSCzQFFSlZTFSvcZpWWcJvtJppvZpLLcDVcv\n" +
                "sgQCsBmmlFCPFFzTgTBgdNnrNndnMrrrfbrNjf\n" +
                "bpZdggTjHbgLglpHjldvHpjdhTVzmhzzzFPzmhFsFQSFnhhN\n" +
                "rPCDBcCCMPGcWDNNWQzQQSNQnNzQ\n" +
                "fCCJtDtGGGfGBtGqBrrcfRBcvPwpLgdZZvHdljvqpvdwbpvl\n" +
                "qpmsNldnlHlCqQlHsHNHwJpJMtwvvvjMvfWjpDtt\n" +
                "TccVBScrzBzzTGPbVTPQhWjfMjwwRtJtjMtWDWWfDS\n" +
                "FQFbzBGczGBFLnFmmqsCLg\n" +
                "qpblblvpvJzStJDrhrnGrdhDfFqf\n" +
                "ggNQNwBgmTcgCBTBTQQjNfDCnZRRRrRGCnrFfdnhrC\n" +
                "mjVFHQTHNjTwcmpzJzHltltbSssS\n" +
                "WChWmdcmzndhFcZrrbvrVMVssj\n" +
                "NQLDlDplpSJGpLfRRMZVBBGjVsGbbjbBZsGv\n" +
                "QNDfNqlpLgSfNfNgNfpgpqwndwWwnCCnnTFMdHndzn\n" +
                "ZGRPTngTZMSGMGnhSgRjQHsPbqjmsWHQCQWbNN\n" +
                "BFLLfpzVDBfDdlfQcsbVcNmQsqqbcC\n" +
                "zFvdplLDLtzFmrrwMMtTrShZ\n" +
                "nTdmnVCGqTsSBTqv\n" +
                "HlMPwMlHfPSfBBmFBfSL\n" +
                "trHHwRHRwMHPMJQJHnDhbdRhdpCZmChNnd\n" +
                "lwHWjzplvHqWHGsMLsLwLfgdfLdg\n" +
                "tPJNPQmQmSGcTtFmctGmSCBgsBBRbLBRVdLVLCBBLgVf\n" +
                "FPtTPQNPrPPQctTcNPSQJJPDjlzplnGDDjWWplWHhGvpnr\n" +
                "jwvvDbvsRsrrjrfvfrrZsPpCpmPJJPqlqWmzRJRTqq\n" +
                "HdLttdSQHdLHMMtNdLMSTtHpCmPplWhCzmzmPWlJhlNplP\n" +
                "BTSLtLLQtnVZDnffbwfw\n" +
                "snvQdrtrQprWpgmGLp\n" +
                "FhzwlwHccBcljFBSDmHmLpgRmPDCffWL\n" +
                "zFhllqjczzwJqqSqlZMsvJgVNMTbssVNnQbb\n" +
                "dLZHrWjWPFZWZnPjZttjddFnMDVMGJMQqvMVGVRVpjVpGVvv\n" +
                "zhzTwTlfTwCsShSgNhfzsQQqvMQStQMDGJJGvGQVvq\n" +
                "TTwCBfsfBwhzwTBCzlmHZdLmBBbtLnLbFnnF\n" +
                "BhBRLFmlBlmhgShHmhSlZlFgvbQNwvcsvMCcsQCwNQvNMsBw\n" +
                "ttWddDjrfjDcssscDbvH\n" +
                "jfjfPWdzdfjdnWpjtrzqnhmJGJFhSJRHSmSmlqlHmq\n" +
                "QvJTgvsvghHRHHNbZvNZTRSzBBCLrDqzrfDDtJSqSLBC\n" +
                "cPPwdcFFPDwfFrBrFfFfrC\n" +
                "nppwdplpRvllsgDH\n" +
                "BGLLWLLwHVZwHnNhwsMsrqMqhh\n" +
                "STlTpDpmjzmjjjgccqdsbNbBhlNnNMhsqs\n" +
                "pjmgjfSDSzmSgFzRZQfRRZLBVLVtZZ\n" +
                "WHjddztMtVLNNFFTmbFPFPRw\n" +
                "bJnvpQfqccQJZfpcbvCphcFGDPFGRwDGDDGwGsmPFnPF\n" +
                "rvffQJZJqrpZCJZJQrQpvBvStlSWSzVSWBbzBLzjtjWWWj\n" +
                "SJFMSMGSDLTsFgHvHL\n" +
                "mNzRrRRzjzqqgPHvLTHjlvWg\n" +
                "ZLbRpRnRnCrbmnmrRRNnwbGfMwDwfDDdSVMdVJdd\n" +
                "nsqTbhcDssPsPWsnchPJMSTSMmJMwTSTCJJfJw\n" +
                "DHvFvvdHpvpGFHDMVVJVplCCVpggCl\n" +
                "RdQjtvHtDQNGsZqzcqPqbNcq\n" +
                "GFzRjczzQJnLjJvvTj\n" +
                "mSfHrNHDzHDrDSSSBvTZLTNqWJWBWLlv\n" +
                "PfgCmfPzDVrtHsddVMsRFcVFQM\n" +
                "sfBgfBfBsHBHFGhsqfjgQZtQQMdZgbZQptbM\n" +
                "rNLRSzRTrrvvLSTWGpjpNZdQPtGtMdNM\n" +
                "wvSWLwzTGTCcwwwJwvwcrcRcVfFBqhhVhDqhBllBfFqBCDCs\n" +
                "LbTpDTcMTSzzMLhScnDnSppNQwVNZFBVnFsrwQQZrQrQrN\n" +
                "tJtJCRlGWljGWCtjJZVPsJBsVwQmrQNN\n" +
                "fvHRftqjGfWGwtfGqvLTzDTzzzchSbMDTd\n" +
                "JJhWZlhqLDHtBDrqrB\n" +
                "bwwmfrSmbmFjVSFQwSdpDvGdpPnRvDtHpGtGPG\n" +
                "VgFfcSQfFgmLLrNThllTZc\n" +
                "QmfvrpnvrrJGnBSCFTBMSWFS\n" +
                "NVMggbVPzCTgDFDD\n" +
                "NRqHRZjVRZdRVdZwNPrMrchGhGpcGfvhQlHJ\n" +
                "nlBdCldndlZTttSSBBccPfGWLLHcTTcWPbbW\n" +
                "jpsFzFmzDzNzDGChGcGGmPQHQf\n" +
                "CNzqvvVJNFqvgRtlqRtdnwSZ\n" +
                "MJtDbNHDDpmVPJVzzjLm\n" +
                "RslhvlfRTWvWWRwfllSZngmggznjSPznLjmSnz\n" +
                "TlhffRwWQhChDqbBQLFHqNrb\n" +
                "HWnmSbzflWltlzLfWWDzjMBvCjjCTCgcMvzBBB\n" +
                "qRRRZJwhZFGdRNfghVjMVVgfcghC\n" +
                "QFFqwNNNwdNZZpqqZfnDSHmmlDLtWtHWlQmD\n" +
                "JrFdNTTLRBTJrFVrBNdVLFBdlHbzQQsQzbPJtpbtltWsHbQw\n" +
                "gZffDfMlCfjCSqMcpHPWHszstzHjQwpb\n" +
                "GMnvfGlfvSqvcMMDgDDcfnqSVFRdmTmVdNBTdmRmBFVnLLBT\n" +
                "ZvRHtDcZntLZssMssQBrMdnC\n" +
                "jglqlVdlbqgVWjJMbrrBCpmQBBfrpm\n" +
                "GqVVPPjPNjFVllNjJjFDvzTLZRvcLRLvTGdGDv\n" +
                "fDVzvVfzzZPMsMbb\n" +
                "LHtBwLBdhFgdHLLthRwFGGMsmrHMmmbZSmqbMGGG\n" +
                "bblRwbTRlllfVQnCQn\n" +
                "fVZzjRzpzpVCRPZhVWQvvLsWWWFQlmjWmG\n" +
                "JDHgJdtwbZqJqsWBBDLlQlvLms\n" +
                "cHHtdbqwrqbbtSbTgSTcVCMRZnRRVNhVPNMPpfMc\n" +
                "fCMPBBdpMpsqMssQccnV\n" +
                "TlwGWDjDZHLjZHHlLGmnlnNcRllsJcqtsJRV\n" +
                "ZHhZHThLLrGwjDDjLwGWWWSjPpbpzrvBFBFdBBbqvCbpFfpg\n" +
                "bvDfDPtCVfFFVdWWpmLRmzWzzdBW\n" +
                "jgZTghhjrGrsswrsghHrlgTGzSRmMLwpJMSMzWLLWRzpRRSc\n" +
                "lpjTpGHlpsNGTHllHrCFnDNPtVnvfQtQtQNP\n" +
                "BwlQcwZBwwwQNqJTrrsRGCDTNt\n" +
                "bMpVPSfRvCbCtTqsCs\n" +
                "dPSRfRpPPjjmLMgZBZBLZZwFQnZn\n" +
                "TsVfggTqVnsLVTdTpmDdRhwPRtPRDRwD\n" +
                "ljHBSWZvvFWvBFPppnQPwnpmzR\n" +
                "MSHSjbBclBSjccLJgqgnLVqTbsTT\n" +
                "zncfVgRzVJgnTfVqNHvZJZNJNMpHbdvH\n" +
                "PCBpsLjPPmMGdHNdHBHZ\n" +
                "jSLlrhLPDWLrPrDCLPCfnpzcVRFcRTnlVncntT\n" +
                "ccvSgjHtRjcjSvjvSrBjzSHHwnJPbgwPPZVVVZnPpZlpwnlT\n" +
                "ffqNqGGsGWqLTNqZwdndPnnJJpZVJW\n" +
                "sNmqhsCMQsMTmjrcmrHrRj\n" +
                "gWWWzNVJDwDzVWVDGbGNnhTnHLsmhmhfsQTNSmHd\n" +
                "vtMPZvrZvqtqBHljrqSnnmTfLfdnQsjhjmhL\n" +
                "MMPZPBqZCrBtvZcrBlDbGbbbzHJCbbRwgwDz\n" +
                "hGSRhsMswhcNNGwhwncMnCqCJNrHJPJJrJtCJdqHJm\n" +
                "BgVTzWBdTfCmfCJH\n" +
                "dlbVFvvWVZhSRQDMnlhc\n" +
                "WfpzBZmgJlQVGvWF\n" +
                "wHSbrHwmccnrmrHsClGqFGbQjQjjQJQQGv\n" +
                "SHPwwsRcrrNtrNSsphmZLzpfzhghZPdD\n" +
                "DFDPRpmgbPQtmgBBQDDNJTMMBZsqsZGqGZTGCGSqWG\n" +
                "fVvVVLcJVzlvzhqfSTCsZsMGMHqq\n" +
                "zJdrrdnzcLlwczwbQmQngRDQPbtDpQ\n" +
                "HDZZrpFqwRrQfBqhjjlVlQ\n" +
                "czTgvvWPNgPGcTlsQflCVshClC\n" +
                "PgNvtSJNvGVMMzNzgGvPGGLHFDdFdmZSZRdDdRrmpFwL\n" +
                "SVHNVFVPBHJqHhgFCgzLmCwppm\n" +
                "DvDdsGZljDlfdZnjnnZGMzLpRgLfMCLmzfPLhmgp\n" +
                "jZDZlrvrZTrTrTQrDsjslHNJqtWbWHbqbPBWNVQWBJ\n" +
                "NmGGBdWWJDJTTZHm\n" +
                "hFVhcqFjncpcppSjqfppqDvzDDDbbDZvDZZbHfJgvJ\n" +
                "jrPqnnHnqSPwPGWPdWst\n" +
                "BfhbwMwbbPbHPPPlrdJjrlMJLrJVTd\n" +
                "pnQnGnWDjnJdlJCh\n" +
                "qshsWvpttzNNQDtzRRPvwfcPHBBBHwbw\n" +
                "SHzGRQjhwwhGzjjwRjfBqpqbNCqNnnqqQqPlQC\n" +
                "TZtgLmZgVmgdFgmZtdrbNqnqlNlpblnlrnBd\n" +
                "DvgmvvZgmWJJjwHHhJSzps\n" +
                "JjlrlJjPJgDjJjJnDRDjNwGGqMvSddvPvwQddqSVvq\n" +
                "SLpphFLhFZhWLzvswwWqsqVVQWdv\n" +
                "FSHtTLZpfzRDDrJgRNjT\n" +
                "wjCMvrMlqqWHvWqddrHqgnBNhcffthhVLtpgLBnw\n" +
                "GbQFZzZZphnpgNZV\n" +
                "FhFzRTDRPzsRQGQGTFlllrJHjdsJlHMqjjHr\n" +
                "LqDcTbmJcqSJSTmnrTcmJrfffplfjZsGZfGGZfQLdplj\n" +
                "hWddgBvzWFZfPsQlGh\n" +
                "RBWBRCdHtgHttVVzHBVNNNDwSTDcSSSbScDDwbwbnmRS\n" +
                "FFPzwlZVVrzFFlFLVlllZdHCHPQMnJQQbhhChdhCbb\n" +
                "BRRqGBgRfqvgvBDDDTRgghNCMMTQNNbVJMNJJdbbdT\n" +
                "DfpgjGfsRWrFVzwLcs\n" +
                "PMTSdSmFjhFpNTqvppvRBrRBrDqB\n" +
                "HnZZznJbzGZGlZtZWHlJGcGcwMvQBsrwRDQvcDgrgDgrqRvq\n" +
                "HGlGfnJZfMMCfNhm\n" +
                "nRssqlqVRppVwdMMQwFgtRFz\n" +
                "smTvLLTvvNLtwMMQNg\n" +
                "CmPGBvZGWvBSGGDmTZjZlhpJcpHDJsbDnlrrprpl\n" +
                "djcQGNQqdGdGqMCgndwgCLDMgW\n" +
                "nvBvHpBppnvPPnJTBWLJVMwVfWJfCbfWgW\n" +
                "hsHHpBsvRTHpsPszTBTTsRTslGqGqlcqlScnqmhZmmZSZSjl\n" +
                "DddBHCmfWCBTDBHTHfMpzhzpJJMJsFrGrz\n" +
                "tPVPmbnttjPnZvSvSbnmZPZPNpNGMpJNzzNrGJpvhsshMpFs\n" +
                "mwnZcbmmStbVtVjbZVlcLTBlcLCRHRDWCWWW\n";
        List<Rucksack> rucksacks = new ArrayList<>();
        List<List<Item>> allItems = new ArrayList<>();
        List<String> lines = List.of(data.split("\\R"));
        for (int i = 0; i < lines.size(); i++) {
            allItems.add(new ArrayList<>());
            for (char c : lines.get(i).toCharArray()) {
                allItems.get(i).add(new Item(c));
            }
        }
        //System.out.println(allItems.get(1));
        for (List<Item> items : allItems) {
            rucksacks.add(new Rucksack(items));
        }
        /*PRIMERA PARTE*/
        Integer cont = 0;
        for (Rucksack rucksack : rucksacks) {
            //System.out.println(rucksack.getTotalItems().size());
            cont += rucksack.getDuplicateItem(rucksack.getCompartment1(), rucksack.getCompartment2()).getPriority();
        }

        //System.out.println(cont);

        /*SEGUNDA PARTE*/
        Integer cont2 = 0;
        List<Group> groups = new ArrayList<>();
        List<Rucksack> rucksackList = new ArrayList<>();
        for (Rucksack rucksack : rucksacks) {
            if (cont2 < 3) {
                rucksackList.add(rucksack);
                cont2 ++;
            }
            else {
                cont2 = 0;
                groups.add(new Group(rucksackList));
                rucksackList = new ArrayList<>();
                rucksackList.add(rucksack);
                cont2++;
            }
        }
        groups.add(new Group(rucksackList));
        Integer sumGroupsPriority = 0;
        for (Group g : groups
             ) {
            //System.out.println(g.rucksacks);
            System.out.println(g.getPriorityInCommon(g.rucksacks));
            sumGroupsPriority += g.getPriorityInCommon(g.rucksacks);
        }
        System.out.println(sumGroupsPriority);

    }
}
